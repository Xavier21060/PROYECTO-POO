import model.*;
import model.Users;

import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {


         showMenu(); //instancia del metod UImenu

       /* Doctor myDoctor = new Doctor("Xavier", "pediatria"); //creando el objeto de l clase doctor
        myDoctor.addAvailableAppointment(new Date(), "4 pm"); // agregrando datos al Arraylist del metodo
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.addAvailableAppointment(new Date(), "3pm");

        System.out.println(myDoctor);

        Users users = new Doctor ("Anhi","ana@ana.com" );
        users.showDataUser(); //voy a mostrar los comportamientos asignado a la clase doctor


        Users usersPatien = new Patien ("Anhi","ana@ana.com" );
        usersPatien.showDataUser();


        Users usersNurse = new Nurse("Anhi","ana@ana.com" );
        usersNurse.showDataUser();

        //INstanciando una clase abstracta de manera anonima
        Users users1 = new Users("anahi", "ana@.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz verde");
                System.out.println("Departamento: Oncologia");
            }
        };

        //Utilizando la clase anonima de la clase abstracta
        users1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
        ISchedulable iSchedulable1 = new AppointmentsDoctor();
        iSchedulable1.schedule(new Date(), "1pm");

        //instancio la CLASE STATIC ANIDADA
       /* for ( model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
            
        }*/
        System.out.println();
        System.out.println();
        
       /* //objeto del paciente
        Patien myPatien = new Patien("carlos", "carlos@gmail");
        System.out.println(myPatien.toString());*/







    }
}
