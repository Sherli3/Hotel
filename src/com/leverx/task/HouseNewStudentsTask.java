package com.leverx.task;

import com.leverx.model.Hostel;
import com.leverx.model.Room;
import com.leverx.model.Student;

public class HouseNewStudentsTask extends BaseTask {

    public HouseNewStudentsTask(Hostel hostel) {
        super(hostel);
    }

    @Override
    public void run() {
        hostel.getFloors().forEach(floor -> {
            floor.getRooms().forEach(room -> {
                for (int i = 0; i < Room.MAX_STUDENTS; i++) {
                    room.addStudent(new Student.Builder().build());
                }
            });
        });
    }
}