package model;

public class Car implements Runnable {
    private int wheels = 4;
    private int doors = 4;
    private int seats = 5;
    private float maxspeed;
    public Car() {
    }

    public Car(float maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public float getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(float maxspeed) {
        this.maxspeed = maxspeed;
    }


    public synchronized void run() {
            System.out.println("thread is running...");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("maxspeed : " + maxspeed);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }

            }
    }

    public void info() {
        System.out.println("wheels = " + getWheels() + "\n doors = " + getDoors() + "\n seats = " + getSeats() + "\n maxspeed = " + getMaxspeed());
    }
}
