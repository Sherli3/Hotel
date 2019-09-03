package com.leverx.task;

import com.leverx.model.Floor;
import com.leverx.model.Hostel;
import com.leverx.model.Room;
import com.leverx.model.Student;

import java.util.stream.Collectors;


public class SetDateTask extends BaseTask {
    public SetDateTask(Hostel hostel) {
        super(hostel);
    }

    @Override
    public void run() {

        for (Floor floor: hostel.getFloors()){
            for (Room room: floor.getRooms()){
                for(Student student : room.getStudents()){
                    student.setStudyCourse(student.getStudyCourse()+1);
                }
            }
        }

        //hostel.getFloors().stream().flatMap(floor -> floor.getRooms().stream()).flatMap(room -> room.getStudents().stream()).map(student -> {student.setStudyCourse(student.getStudyCourse()+1); return student;}).collect(Collectors.toList());

    }
}
