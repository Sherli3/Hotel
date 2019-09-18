package com.leverx.task;

import com.leverx.model.Floor;
import com.leverx.model.Hostel;
import com.leverx.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class PickHeadStudentTask extends BaseTask {
    private int floorNumber;

    public PickHeadStudentTask(Hostel hostel, int floorNumber) {
        super(hostel);
        this.floorNumber = floorNumber;
    }

    @Override
    public void run() {
        Floor floor = hostel.getFloors().get(floorNumber);
        List<Student> students = floor.getRooms().stream().flatMap
                (room -> room.getStudents().stream()).filter(Student::hasGoodBehaviorForHeadStudent)
                .collect(Collectors.toList());
        floor.setHead(students.get((int) (Math.random() * students.size())));

    }
}
