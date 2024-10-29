/* GreetingsThread.java */
public class GreetingsThread extends Thread {
    private Messages msg;
    private int choice;

    public GreetingsThread(Messages msg, int choice) {
        this.msg = msg;
        this.choice = choice;
    }

    public void run() {
        System.out.println("Started the " + msg.getMessage(choice) + " thread...");

        for (int i = 0; i < 10; i++) {
            System.out.println(msg.getMessage(choice));

            try {
                // Sleep for 1 second (1000 milliseconds)
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Interrupted while sleeping...");
            }
        }

        System.out.println("Exiting the " + msg.getMessage(choice) + " thread...");
    }
}