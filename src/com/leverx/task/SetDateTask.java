package com.leverx.task;

import com.leverx.model.Hostel;
import com.leverx.model.Student;

import java.util.List;

public class SetDateTask extends BaseTask {
    public SetDateTask(Hostel hostel) {
        super(hostel);
    }

    @Override
    public void run() {
        hostel.getFloors().forEach(floor -> {
            floor.getRooms().forEach(room -> {
                room.getStudents().stream().map(student -> student.getStudyCourse()+1);
            });
        });

    }
}
