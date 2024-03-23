package task2.numberCars;

/**
 * the class stores the new car object
 */
public class NewCar extends Thread{
    public Car car;
    public NewCar(Car car){
        this.car = car;
    }
    @Override
    public void run() {
        car.newCar(car);
    }

}
