package com.leverx.model;

import java.util.ArrayList;
import java.util.List;


public class Floor {
    public static final int MAX_ROOMS = 3;
    private int numberFloor;
    private Student head;
    private List<Room> rooms = new ArrayList<>();

    public Floor(int numberFloor) {
        this.numberFloor = numberFloor;
        for (int i = 0; i < MAX_ROOMS; i++) {
            rooms.add(new Room());
        }
    }

    public Student getHead() {
        return head;
    }

    public void setHead(Student head) {
        this.head = head;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
