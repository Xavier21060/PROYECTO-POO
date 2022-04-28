package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Users {

      //creamos el primer atribbuto
      private String speciality; //es el unico atributo que diferecia al docto de los demas model.Users
      private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
      public Doctor(String name, String email){  // vamos a asignarlos los datos name y specilaity a las vaiabls que estan de manera global
          super(name, email); //heredan los atributos de la clase User
      }

      public String speciality() {
        return speciality;
      }

      public void setSpeciality(String speciality) {
        this.speciality = speciality;
      }

        //Coleccion de onjetos en un ArrayList para crear las citas
        // ArrayList <va añadir todos_las_variables_de_la_clase> nameVariable = new Arraylist<>()


         //metodo de la CLASE ANIDADA para agregar los elementos del ArrayList
        public void addAvailableAppointment(String date, String time){
            //De la coleccion del arrayList va a añadir un objeto cada vez que se cree una nueva cita...
            //de la CLASE AvailableAppointment
            availableAppointments.add(new Doctor.AvailableAppointment(date,time));
        }
        //Devolve las citas disponible del array
        public ArrayList<AvailableAppointment>getAvailableAppointments(){
            return availableAppointments;
        }

    @Override
    public String toString() {
        return super.toString() + "Doctor: " +
                "\nspeciality=" + speciality +
                "\navailableAppointments=" + availableAppointments.toString() +
                '\n';
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del hospital: cruz roja");
        System.out.println("Departamento: Ontologia");
    }


    //CLASE ANIDADA de las citas disponibles del doctor
        public  static class AvailableAppointment{
            private int id_avaiableAppointment; //citas disponibles
            private Date date;
            private String time;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

            //metodo constructor
            public AvailableAppointment(String date, String time) {
                try {
                    this.date = format.parse(date);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                this.time = time;
            }

            public Date getDate(String DATE) {
                return date;
            }

            public String getDate() {
                return format.format(date);
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

            public int getId_avaiableAppointment() {
                return id_avaiableAppointment;
            }

            public void setId_avaiableAppointment(int id_avaiableAppointment) {
                this.id_avaiableAppointment = id_avaiableAppointment;
            }

            @Override
            public String toString() {
                return "AvailableAppointment:" +
                        "\ndate=" + date +
                        "\ntime='" + time +  +
                        '\n';
            }
        }

}
