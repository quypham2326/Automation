import model.BMW;
import model.Car;
import model.Toyota;

public class Main {
    public static void main(String args[]){
        Car toyota = new Toyota(100);
        Car bwm = new BMW(200);
        System.out.println("Question 1 ");
        System.out.println("Toyota : ");
        toyota.run();
        toyota.info();
        System.out.println("BWM : ");
        bwm.run();
        bwm.info();

        System.out.println("Question 2 ");
        Thread t1 =new Thread(toyota);
        Thread t2 =new Thread(bwm);
        t1.start();
        t2.start();
    }

}
