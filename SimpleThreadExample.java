/* SimpleThreadExample.java */
public class SimpleThreadExample {

    public static void main(String[] args) {
    
        
        Messages msg = new Messages();
        Thread morningThread = new GreetingsThread(msg, 0);
        Thread afternoonThread = new GreetingsThread(msg, 1);

        morningThread.start();
        afternoonThread.start();
        //MARK
        
    }
}