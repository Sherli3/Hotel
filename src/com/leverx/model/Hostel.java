package com.leverx.model;

import com.leverx.task.BaseTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Hostel extends Thread {
    public static final int MAX_FLOORS = 4;

    private Commandant commandant;
    private Guard guard;
    private List<Floor> floors = new ArrayList<>();
    private volatile boolean isOpen = true;
    private volatile Queue<Runnable> runnableQueue = new ArrayBlockingQueue<>(16);

    public Hostel() {
        commandant = Commandant.getInstance();
        guard = Guard.getInstance();
        for (int i = 0; i < MAX_FLOORS; i++) {
            floors.add(new Floor(i + 1));
        }
    }

    @Override
    public void run() {
        super.run();
        while (isOpen) {
            if (runnableQueue.size() > 0) {
                runnableQueue.poll().run();
            }
        }
    }

    public void runTask(BaseTask task) {
        runnableQueue.add(task);
    }

    public void close() {
        isOpen = false;
    }

    public List<Floor> getFloors() {
        return floors;
    }


}
