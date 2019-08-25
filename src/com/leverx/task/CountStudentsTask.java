package com.leverx.task;

import com.leverx.model.Hostel;

public class CountStudentsTask extends BaseTask {

    public CountStudentsTask(Hostel hostel) {
        super(hostel);
    }

    @Override
    public void run() {
        System.out.println("Counting students...");
        hostel.getFloors().forEach(floor -> {
            floor.getRooms().forEach(room -> {
                room.getStudents().forEach(student -> {
                    System.out.println(student.toString());
                });
            });
        });
        System.out.println("---> Counting ends");
    }
}