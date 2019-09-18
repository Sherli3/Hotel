package com.leverx.task;

import com.leverx.model.Commandant;
import com.leverx.model.Hostel;
import com.leverx.model.Student;

public class CommandantTaskInRoom extends BaseTask {
    public CommandantTaskInRoom(Hostel hostel) {
        super(hostel);
    }

    @Override
    public void run() {
        hostel.getFloors().forEach(floor -> {
            floor.getRooms().forEach(room -> {
                room.getStudents().stream().filter(Student::hasGoodBehavior).
                        forEach(student -> Commandant.getInstance().houseStudentInCommandant(hostel, student));

            });
        });

    }
}
