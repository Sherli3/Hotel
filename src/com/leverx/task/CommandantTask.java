package com.leverx.task;

import com.leverx.model.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CommandantTask extends BaseTask  {
    public CommandantTask(Hostel hostel) {
        super(hostel);
    }

    @Override
    public void run() {
        hostel.getFloors().forEach(floor -> {
            floor.getRooms().forEach(room -> {
                room.getStudents().stream().filter(student ->
                        !student.isExpelled()&& student.getStudyCourse()>1
                                && student.getRemark()==0 &&student.isAccessAvailable()).
                        forEach(student -> Guard.getInstance().houseStudentIn(student));
            });
        });

       /* List<Student> list= hostel.getFloors().forEach(floor -> {
            floor.getRooms().stream().flatMap(room -> {
                room.getStudents().stream().filter(student ->
                        student.getStudyCourse() <= 4 && student.getRemark() < 2
                                && !student.isExpelled() && !student.isAccessAvailable()).collect(Collectors.toList());
            });
        });*/

    }
        }
