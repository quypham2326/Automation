package model;

public class Thread extends java.lang.Thread {
    private String msg;
    private Thread t;
    private Car  car;

    public Thread(String msg , Car car){
        this.msg= msg;
        this.car = car;
    }
    public void run(){
        synchronized(car)
        {
            // synchronizing the snd object
            car.run();
        }
    }
}
