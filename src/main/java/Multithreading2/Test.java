package Multithreading2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;// используем volatile для решения проблемы когерентности кэшей

    public void run() {
        while (running){
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
