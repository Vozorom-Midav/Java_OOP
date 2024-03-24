package lesson_5_oop.models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;

    private int id;

    private Date date;

    private String name;

    private Table table;

    public Reservation(Table table, Date reservationDate, String name){
        id = ++counter;
        this.table = table;
        this.date = reservationDate;
        this.name = name;
    }

    public void setTable(Table table){this.table = table;}

    public int getId(){return id;}

    public Date getDate(){return date;}

    public String getName(){return name;}

    public Table getTable(){return table;}
    
}
