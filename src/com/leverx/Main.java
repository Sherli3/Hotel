package com.leverx;

import com.leverx.model.Hostel;
import com.leverx.task.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Hostel hostel = new Hostel();
        HostelNewStudentsTask hostelNewStudentsTask = new HostelNewStudentsTask(hostel);
        CountStudentsTask countStudentsTask = new CountStudentsTask(hostel);
        CommandantTaskEvictStudent commandantTaskEvictStudent= new CommandantTaskEvictStudent(hostel);
        hostel.executeTask(hostelNewStudentsTask);
        hostel.executeTask(countStudentsTask);
        hostel.executeTask(commandantTaskEvictStudent);


    }

}
