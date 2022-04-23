package model;

import java.util.Date;

public class AppointmentsDoctor implements ISchedulable {

    private int id;
    private Patien patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patien patient() {
        return patient;
    }

    public void setPatient(Patien patient) {
        this.patient = patient;
    }

    public Doctor doctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date date() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String time() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override //Implementadon la interfaz
    public void schedule(Date date, String time) {

    }
}
