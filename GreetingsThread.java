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
            
        //print 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println(msg.getMessage(choice));
        }

        System.out.println("Exiting the " + msg.getMessage(choice) + " thread...");
    }
}
