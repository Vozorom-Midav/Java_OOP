package lesson_5_oop;

import java.util.Date;

import lesson_5_oop.models.TablesRepository;
import lesson_5_oop.presenters.BookingPresenter;
import lesson_5_oop.views.BookingView;

public class Program {
    public static void main(String[] args) {
        TablesRepository tablesRepository = new TablesRepository();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tablesRepository, bookingView);

        bookingPresenter.updateTablesView();
        bookingView.reservationTable(new Date(), 2, "Станислав");

        bookingView.changeReservationTable(1001, new Date(), 4, "Станислав");

    }
}
