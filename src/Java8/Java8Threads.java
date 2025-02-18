package Java8;

public class Java8Threads {
    public static void main(String[] args) {
        // Creating 10 traditional threads
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(() -> {
                System.out.println("Running in thread: " +
                        Thread.currentThread().getName());
            });
            thread.start();
        }
    }
}


