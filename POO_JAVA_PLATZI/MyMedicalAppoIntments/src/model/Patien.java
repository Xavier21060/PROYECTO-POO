package model;

import java.util.ArrayList;
import java.util.Date;

public class Patien extends Users {

    //Atributos de la clase empleado
    private String birthday;
    private String blood;
    private double weight; //solo va a ser accesible o modificable desde esta clases
    private double height; //solo va a ser accesible o modificable desde esta clases
    private ArrayList<AppointmentsDoctor> appointmentsDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentsDoctor> getAppointmentsDoctors() {
        return appointmentsDoctors;
    }

    public void addAppointmentsDoctors(Doctor doctor, Date date, String time){
       AppointmentsDoctor appointmentsDoctor = new AppointmentsDoctor(this,doctor);
       appointmentsDoctor.schedule(date,time);
       appointmentsDoctors.add(appointmentsDoctor);
       this.appointmentsDoctors = appointmentsDoctors;
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    //metodo constructor
    public Patien (String name, String email) {
        super(name, email); // heredo los atributos de la clase padre(model.Users)

    }

    //creacion de un metodo getter y setters
    public String getWeight(){ // siempre que tenga un valor de retorno que asignarle la palabra return
        return this.weight + " kg ";
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHeight() {
        return this.height + "metros";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "model.Patien: " +
                "\nbirthday=" + birthday + "\nblood=" + blood +
                "\nweight=" + getWeight() +
                "\nheight=" + getHeight() + '\n';
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciete");
        System.out.println("Historial clinico");


    }


}

