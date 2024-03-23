package task2.numberCars;

/**
 *
 the class stores a car object and two methods: adding a car and subtracting it
 */
public class Car extends Thread{

    public int numCar;

    public Car(int numCar) {
        this.numCar = numCar;
    }


    public synchronized void newCar(Car newCars){
        while(newCars.numCar < INumberCars.maxNumberCars){
            System.out.println("Машин на ремонте: " + ++newCars.numCar+"\nприехала одна");
        }
        notify();
    }

    public synchronized void cars(Car cars){
        while(cars.numCar > -1) {
            System.out.println("Машин на ремонте: "+ cars.numCar + "\nуехала одна");
            cars.numCar--;
        }
        notify();
    }
}
