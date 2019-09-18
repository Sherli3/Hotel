package com.leverx.task;

import com.leverx.model.Commandant;
import com.leverx.model.Hostel;
import com.leverx.model.Student;

public class CommandantTaskEvictStudent extends BaseTask {

    public CommandantTaskEvictStudent(Hostel hostel) {
        super(hostel);
    }

    @Override
    public void run() {

        hostel.getFloors().forEach(floor -> {
            floor.getRooms().forEach(room -> {
                room.getStudents().stream().filter(Student::hasRemarkStudents).
                        forEach(student -> Commandant.getInstance().evictStudentCommandant(room, student));
            });
        });


    }
}
