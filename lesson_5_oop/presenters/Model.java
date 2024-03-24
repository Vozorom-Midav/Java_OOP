package lesson_5_oop.presenters;

import java.util.Collection;
import java.util.Date;

import lesson_5_oop.models.Table;

public interface Model {
    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int rableNo, String name);

    void deleteReservation(int reservationNo);
}
