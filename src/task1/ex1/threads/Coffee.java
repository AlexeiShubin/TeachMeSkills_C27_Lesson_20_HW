package task1.ex1.threads;

/**
 * the class stores a stream with an object coffee
 */
public class Coffee implements Runnable{

    Thread thread;

    public Coffee(){
        System.out.println("coffee");
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        action();
    }

    private void action(){
        System.out.println("Drinking coffee");
    }
}
