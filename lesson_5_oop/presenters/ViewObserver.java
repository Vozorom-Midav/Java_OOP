package lesson_5_oop.presenters;

import java.util.Date;

/**
 * ViewObserver
 */
public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}