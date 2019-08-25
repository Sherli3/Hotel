package com.leverx.task;

import com.leverx.model.Hostel;

public abstract class BaseTask implements Runnable {
    protected Hostel hostel;

    public BaseTask(Hostel hostel) {
        this.hostel = hostel;
    }
}