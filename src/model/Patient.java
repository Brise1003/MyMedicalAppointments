package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    // Atributes

    private String birthDay;
    private double weight;
    private double heigth;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    // Constructor method
    public Patient(String name, String email){
        super(name, email);
    }

    // Getters & setters
    // 54.7 kg String
    public String getWeight(){
        return this.weight + " kg.";
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    // 1.74 m String
    public String getHeight(){
        return this.heigth + " m.";
    }

    public void setHeight(String height){
        this.heigth = heigth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthDay + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() +
                "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial de paciente");
    }
}
