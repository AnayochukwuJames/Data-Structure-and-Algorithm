package org.example;

import java.util.ArrayList;
import java.util.List;

public class Thread {
    public static void main(String[] args) {
        List<java.lang.Thread> thread = new ArrayList<java.lang.Thread>();
        for (int i = 0; i < 50; i++){
            Runnable task = new MyRunnable(100L +i);
            java.lang.Thread work = new java.lang.Thread(task);
            work.setName(String.valueOf(i));
            work.start();
            thread.add(work);
        }
        int running = 0;
        do {
            running = 0;
            for (java.lang.Thread james : thread) {
                if (james.isAlive()) {
                    running++;
                }
            }
            System.out.println("We have " + running + "running thread. ");
        }while (running > 0);
        }
    }

