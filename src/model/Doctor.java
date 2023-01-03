package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    // Atributos
    private String speciality;
    // Guardar las citas en un ArrayList
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    // Método constructor
    public Doctor(String name, String email){
        super(name, email);
        this.speciality = speciality;

    }

    // Getters y setters

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    // Introducir un nuevo elemento o cita en el ArrayList de citas
    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }
    // Mostrar el ArrayList o todas las citas
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\n Available: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología.");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String Date) {
            return date;
        }
        public String getDate(){
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

        @Override
        public String toString() {
            return "Available appointments: \nDate: " + date + "\nTime: " + time;
        }
    }
}
