/* SimpleThreadExample.java */
public class SimpleThreadExample {
    public static void main(String[] args) {
        Messages msg = new Messages();
        Thread morningThread = new GreetingsThread(msg, 0);
        Thread afternoonThread = new GreetingsThread(msg, 1);

        morningThread.start();

        try {
            System.out.println("Joining the morning thread for 5 seconds...");
            morningThread.join(5000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted while joining a thread...");
        }

        afternoonThread.start();

        System.out.println("Main method exiting...");
    }
}