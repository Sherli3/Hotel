package com.leverx.task;

import com.leverx.model.Floor;
import com.leverx.model.Hostel;
import com.leverx.model.Room;
import com.leverx.model.Student;

public class AddAcademicYearTask extends BaseTask {
    public AddAcademicYearTask(Hostel hostel) {
        super(hostel);
    }

    @Override
    public void run() {

        for (Floor floor : hostel.getFloors()) {
            for (Room room : floor.getRooms()) {
                for (Student student : room.getStudents()) {
                    student.setStudyCourse(student.getStudyCourse() + 1);
                }
            }
        }

    }
}
