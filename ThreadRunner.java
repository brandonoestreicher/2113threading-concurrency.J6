/* ThreadRunner.java */
public class ThreadRunner {

    private static volatile boolean statusFlag = false;

    private static class SimpleThreadOne extends Thread {
        public void run() {
            for (int i = 1; i <= 2000; i++){
                System.out.println("Simple thread one counter - " + i);
            }
            // Change the status flag.
            statusFlag = true;
            System.out.println("Status flag changed to true in simple thread one.");
        }
    }

    private static class SimpleThreadTwo extends Thread {
        public void run() {
            int waitCounter = 1;
            while (!statusFlag) {
                waitCounter++;
            }
            System.out.println("Start simple thread two processing " + waitCounter);
        }
    }

    public static void main(String[] args) {
        SimpleThreadOne simpleThreadOne = new SimpleThreadOne();
        simpleThreadOne.start();
        SimpleThreadTwo simpleThreadTwo = new SimpleThreadTwo();
        simpleThreadTwo.start();
    }
}