package task1.ex1.threads;

/**
 * the class stores a stream with an object breakfast
 */
public class Breakfast implements Runnable{

    Thread thread;

    public Breakfast(){
        System.out.println("breakfast");
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        action();
    }

    private void action(){
        System.out.println("eating breakfast");
    }
}
