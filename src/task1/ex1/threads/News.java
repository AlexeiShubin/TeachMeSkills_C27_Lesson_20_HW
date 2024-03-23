package task1.ex1.threads;

/**
 * the class stores a stream with an object news
 */
public class News implements Runnable{

    Thread thread;

    public News(){
        System.out.println("news");
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
       action();
    }

    private void action(){
        System.out.println("Reading news");
    }
}
