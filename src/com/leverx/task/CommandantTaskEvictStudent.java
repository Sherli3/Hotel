package com.leverx.task;

import com.leverx.model.Commandant;
import com.leverx.model.Guard;
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
                room.getStudents().stream().filter(student ->
                    student.getStudyCourse() > 4 && student.getRemark()> 2
                         && !student.isExpelled() && !student.isAccessAvailable()).
                       forEach(student -> Commandant.getInstance().evictStudentCommandant(student));

            });
        });

    }
}
