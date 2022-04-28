package ui;

import model.Doctor;
import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatienMenu {
     public static void showPatientMenu() { // selecciono el caso 2
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome " + UIMenu.patienLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {

                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
    }
    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");

            //Declarando una coleccion de Datos de tipo Map
            //Numeracion de la lista de fechas
            //Va a llevar el indice de la fecha seleccionada
            //1).Integer va a llevar los indices
            //2). Integer va a llevar los indices de la fecha
            //3).Doctor Lleva el nombre del doctor
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            //para que capture los datos
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorAvailableAppointment.size(); i++) {
                //Un ArrayList para que capture las citas
                ArrayList<Doctor.AvailableAppointment> availableAppointments =
                        UIDoctorMenu.doctorAvailableAppointment.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j <availableAppointments.size() ; j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorAvailableAppointment.get(i));
                    doctorAppointments.put(Integer.valueOf(k), (Doctor) doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");

            for (Map.Entry<Integer, Doctor> doc :doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() +
                    ". Date: " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Date");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1){
                UIMenu.patienLogged.addAppointmentsDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();
            }


        }while (response!= 0);
    }

    private static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println("::My Appointments");
            if (UIMenu.patienLogged.getAppointmentsDoctors().size() == 0){
                System.out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patienLogged.getAppointmentsDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patienLogged.getAppointmentsDoctors().get(i).date().getDate() +
                        " Time: " + UIMenu.patienLogged.getAppointmentsDoctors().get(i).getTime() +
                        "\n Doctor: " + UIMenu.patienLogged.getAppointmentsDoctors().get(i).doctor().getName()
                );
            }
            System.out.println("0.Salir");
        }while (response!= 0);
    }
 }


