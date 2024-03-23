package task1.ex2.threads;
/**
 * the class stores a stream with an object breakfast
 */
public class Breakfast extends Thread{

        public String TreadName;

        public Breakfast(String name) {
            System.out.println(name);
            this.TreadName = name;
        }

        @Override
        public void run() {
            eatingBreakfast();
        }

        private void eatingBreakfast() {
            System.out.println("Eating breakfast");
        }
}
