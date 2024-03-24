package lesson_5_oop.presenters;

import java.util.Date;

/**
 * BookingPresenter
 */
public class BookingPresenter implements ViewObserver {

    private Model model;

    private View view;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    public void updateTablesView(){
        view.showTables(model.loadTables());
    }

    private void updateReservationTableView(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try{
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateReservationTableView(reservationNo);
        }
        catch(Exception e){
            updateReservationTableView(-1);
        }
    }
}