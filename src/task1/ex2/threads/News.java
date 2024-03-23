package task1.ex2.threads;
/**
 * the class stores a stream with an object news
 */
public class News extends Thread{

    public String name;

    public News(String name) {
        System.out.println(name);
        this.name = name;
    }

    @Override
    public void run() {
        drinkingCoffee();
    }

    private void drinkingCoffee() {
        System.out.println("Reading news");
    }
}
