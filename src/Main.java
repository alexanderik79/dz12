
public class Main {
    public static void main(String[] args) throws InterruptedException {

        First first = new First();
        Thread thread1 = new Thread(first);
        thread1.start();

        Second second = new Second();
        Thread thread2 = new Thread(second);
        thread2.start();

        Third third = new Third();
        try {
            third.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Runnable rnbl = () -> {
            System.out.println("fourth");
        };
        new Thread(rnbl).start();

        Fourth fourth = new Fourth();
        for (int i = 0; i <10; i++) {
            Thread thread4 = new Thread(fourth);
            thread4.start();
        }

        Creature creature1 = new Creature("Egg");
        Creature creature2 = new Creature("Chicken");

        for (int i = 0; i < 10; i++) {
            Thread threadCr1 = new Thread(creature1);
            Thread threadCr2 = new Thread(creature2);
            threadCr1.start();
            threadCr2.start();
//            threadCr2.join(); // если раскомментировать то фраза "The end" будет в конце
        }

        System.out.println("The end");
    }
}