package com.leverx.fake;

import com.leverx.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GeneretedStudents {
    private static final GeneretedStudents generetStudents ;
    private List<Student> students;
    static {
        generetStudents = new GeneretedStudents();
    }


    private GeneretedStudents(){
        students = new ArrayList<>();
        Student student = new Student("Student " + ((int) (Math.random() * 10000)), ((int)(Math.random()*4)));
        students.add(student);

    }
    public static GeneretedStudents generetStudents(){
        return generetStudents;
    }
    public List<Student> studentList(){
        return students;
    }
}
