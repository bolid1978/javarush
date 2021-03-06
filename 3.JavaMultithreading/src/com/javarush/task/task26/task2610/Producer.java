package com.javarush.task.task26.task2610;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    volatile private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            int i = 0;
            while (true) {
               // queue.put(String.valueOf(i++));
                queue.take();
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}