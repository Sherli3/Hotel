package com.leverx;

import com.leverx.model.Hostel;
import com.leverx.task.CountStudentsTask;
import com.leverx.task.HouseNewStudentsTask;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Hostel hostel = new Hostel();
        hostel.start();
        System.out.println("fdsfsgsffsfsdfds");
        hostel.runTask(new HouseNewStudentsTask(hostel));
        Thread.sleep(500);
        hostel.runTask(new CountStudentsTask(hostel));
    }


}
