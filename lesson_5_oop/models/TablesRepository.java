package lesson_5_oop.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import lesson_5_oop.presenters.Model;

public class TablesRepository implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if(tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for(Table table : tables) {
            if(table.getNO() == tableNo){
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }
    
}
