package task1.ex2.runner;


import task1.ex2.threads.Breakfast;
import task1.ex2.threads.Coffee;
import task1.ex2.threads.News;

public class Runner {
    public static void main(String[] args) {
        Breakfast breakfast=new Breakfast("breakfast");
        breakfast.setPriority(2);
        breakfast.start();
        Coffee coffee=new Coffee("coffee");
        coffee.setPriority(3);
        coffee.start();
        News news=new News("news");
        news.setPriority(5);
        news.start();
    }
}
