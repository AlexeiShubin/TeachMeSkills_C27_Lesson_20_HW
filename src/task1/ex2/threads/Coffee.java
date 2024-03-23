package task1.ex2.threads;
/**
 * the class stores a stream with an object coffee
 */
public class Coffee extends Thread{
    public String name;

    public Coffee(String name) {
        System.out.println(name);
        this.name = name;
    }

    @Override
    public void run() {
        drinkingCoffee();
    }

    private void drinkingCoffee() {
        System.out.println("Drinking coffee");
    }
}
