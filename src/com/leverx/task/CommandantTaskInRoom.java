package com.leverx.task;

import com.leverx.model.Commandant;
import com.leverx.model.Hostel;

public class CommandantTaskInRoom extends BaseTask{
    public CommandantTaskInRoom(Hostel hostel) {
        super(hostel);
    }

    @Override
    public void run() {
      hostel.getFloors().forEach(floor -> {
        floor.getRooms().forEach(room -> {
            room.getStudents().stream().filter(student ->
                    !student.isExpelled() && student.getStudyCourse() > 1
                            && student.getRemark() == 0 && student.isAccessAvailable()).
                    forEach(student -> Commandant.getInstance().houseStudentInCommandant(student));

        });
      });

    }
}
