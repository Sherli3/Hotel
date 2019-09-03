package com.leverx.model;


public class Guard {
    private static Guard guard;
    private String name = "Valery Ivanovich";
    private Room room;

    private Guard() {
    }

    public static Guard getInstance() {
        Guard local = guard;
        if (local == null) {
            synchronized (Guard.class) {
                local = guard;
                if (local == null) {
                    guard = local = new Guard();
                }
            }
        }
        return local;

    }

    public void evictStudent(Student student) {
        room.removeStudent(student);

    }

    public void houseStudentIn(Student student) {
        room.addStudent(student);

    }

}
