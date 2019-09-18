package com.leverx.model;

public class Commandant {
    private static Commandant commandant;

    private Commandant() {

    }

    public static synchronized Commandant getInstance() {
        if (commandant == null) {
            commandant = new Commandant();
        }
        return commandant;

    }

    public void evictStudentCommandant(Room room, Student student) {
        Guard.getInstance().evictStudent(room, student);
    }

    public void houseStudentInCommandant(Hostel hostel, Student student) {
        Guard.getInstance().houseStudentIn(hostel, student);
    }
}
