package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable{ //voy a implementar las interface
    private int id;
    private Nurse nurse;
    private Patien patien;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patien getPatien() {
        return patien;
    }

    public void setPatien(Patien patien) {
        this.patien = patien;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override //La manera como se implementa una interfaz
    public void schedule(Date date, String time) {

    }
}
