package lesson_5_oop.presenters;

import java.util.Date;

/**
 * ViewObserver
 */
public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);
}