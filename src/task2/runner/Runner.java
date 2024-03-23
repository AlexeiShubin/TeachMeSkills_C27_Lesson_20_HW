package task2.runner;

import task2.numberCars.Car;
import task2.numberCars.NewCar;
import task2.numberCars.RepairedCar;

public class Runner {
    public static void main(String[] args) {
        Car car=new Car(5);
        Thread thread1=new NewCar(car);
        thread1.start();

        Thread thread2=new RepairedCar(car);
        thread2.start();
    }
}
