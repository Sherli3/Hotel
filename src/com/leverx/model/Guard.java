package com.leverx.model;


public class Guard {
    private static Guard guard;

    private Guard() {
    }

    public static synchronized Guard getInstance() {
        if (guard == null) {
            guard = new Guard();
        }
        return guard;

    }

    public void evictStudent(Room room, Student student) {
        room.removeStudent(student);

    }

    public void houseStudentIn(Hostel hostel, Student student) {
        hostel.getFloors().forEach(floor -> {
            floor.getRooms().forEach(room -> {
                for (int i = 0; i < Room.MAX_STUDENTS; i++) {
                    room.addStudent(student);
                }
            });
        });

    }
}
