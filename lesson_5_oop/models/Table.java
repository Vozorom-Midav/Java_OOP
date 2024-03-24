package lesson_5_oop.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    private static int counter;

    private int no;

    private Collection<Reservation> reservations = new ArrayList<>();

    public Table(){
        no = ++counter;
    }

    public Collection<Reservation> getReservations(){
        return reservations;
    }

    public int getNO(){
        return no;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }
    
}
