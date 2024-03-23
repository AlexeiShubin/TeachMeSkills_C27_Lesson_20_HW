package task1.ex1.runner;

import task1.ex1.threads.Breakfast;
import task1.ex1.threads.Coffee;
import task1.ex1.threads.News;

public class Runner {
    public static void main(String[] args) {
        Breakfast breakfast=new Breakfast();
        Coffee coffee=new Coffee();
        News news=new News();
    }
}
