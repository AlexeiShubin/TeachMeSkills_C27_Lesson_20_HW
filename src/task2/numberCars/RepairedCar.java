package task2.numberCars;

/**
 *
 the class stores the object of the driven away car
 */
public class RepairedCar extends Thread{
    public Car car;
    public RepairedCar(Car car){
        this.car = car;
    }
    @Override
    public void run() {
        car.cars(car);
    }
}
