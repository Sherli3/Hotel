package com.leverx.model;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Room {
    public static final int MAX_STUDENTS = 3;
    private int numberRoom;

    private List<Student> students = new CopyOnWriteArrayList<>();

    public int addStudent(Student student) {
        students.add(student);
        return students.size();

    }

    public boolean removeStudent(int studentNumber) {
        if (studentNumber < students.size() && studentNumber >= 0) {
            return (students.remove(studentNumber) != null);

        }
        return false;
    }

    public List<Student> getStudents() {
        return students;
    }
}
