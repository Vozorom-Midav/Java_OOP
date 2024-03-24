package lesson_5_oop.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import lesson_5_oop.models.Table;
import lesson_5_oop.presenters.View;
import lesson_5_oop.presenters.ViewObserver;

/**
 * BookingView
 */
public class BookingView implements View {

    private Collection<ViewObserver> observers;

    @Override
    public void registerObserver(ViewObserver observer) {
        if(observers == null)
            observers = new ArrayList<>();
        observers.add(observer);

    }

    @Override
    public void showTables(Collection<Table> tables) {
        for(Table table: tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if(reservationNo > 0){
            System.out.printf("Столик успешно забронирован. Номер брони: #%d\n", reservationNo);
        }
        else{
            System.out.println("Произошла ошибка при попытке забронировать столик. \nПовторите попытку позже");
        }
    }

    public void reservationTable(Date orderDate, int tableNo, String name){
        if(observers != null)
            for(ViewObserver observer : observers){
                observer.onReservationTable(orderDate, tableNo, name);
            }
    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        
    }
    
}