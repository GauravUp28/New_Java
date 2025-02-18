package Java23;

public class Java23VirtualThreads {
    public static void main(String[] args) {
        // Creating 10 lightweight virtual threads
        for (int i = 1; i <= 10; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Running in virtual thread: " +
                        Thread.currentThread().getName());
            });
        }
    }
}

