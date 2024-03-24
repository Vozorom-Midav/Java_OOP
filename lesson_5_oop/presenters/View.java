package lesson_5_oop.presenters;

import java.util.Collection;

import lesson_5_oop.models.Table;

/**
 * View
 */
public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void showChangeReservationTableResult(int oldReservation, int reservationNo);

    void registerObserver(ViewObserver observer);
    
}