
package ui;

import model.Doctor;
import model.Patien;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String MONTHS[] = {"Enero", "Febrero", "Marzo", "Abriel", "Mayo", "Junio", "Julio", "agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}; //un array de meses de metodo static
    public static Doctor doctorLogged;
    public static Patien patienLogged;

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    //showPatientMenu(); //si el caso es 2 muestra el menu ede los pacientes

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    private static void authUser(int userType) {
        //userype= 1 Doctor
        //userype= 2 patien

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro", "alejandro@mial.com"));
        doctors.add(new Doctor("Karen sosa", "rocio@mail.com"));
        doctors.add(new Doctor("Rocio gomez", "rocio@nail.com"));

        ArrayList<Patien> patiens = new ArrayList<>();
        patiens.add(new Patien("Anahi salgado", "anahi@gmail.com"));
        patiens.add(new Patien("Roberto Rodriguez", "rober@mail.com"));
        patiens.add(new Patien("carlos Sanchez", "carlosanmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Inserte your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) {
                for (Doctor doctor : doctors) {
                    if (doctor.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtener el dtao del usuario logeado
                        doctorLogged = doctor;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType == 2) {
                for (Patien patien : patiens) {
                    if (patien.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtener el dtao del usuario logeado
                        patienLogged = patien;
                    }
                }
            }
        } while (!emailCorrect);
    }
    public static void showPatientMenu() { // selecciono el caso 2
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {

                case 1:

                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) { //For: los primeros tre smeses de del año
                        System.out.println((i + 1) + ". " + MONTHS[i]);

                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }

}