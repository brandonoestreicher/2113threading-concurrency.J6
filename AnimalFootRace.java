/* AnimalFootRace.java */
public class AnimalFootRace {
    public static void main(String[] args) {
        Thread tortoiseThread = new AnimalRacerThread("Tortoise", 5);
        Thread hareThread = new AnimalRacerThread("Hare", 20);
        Thread cheetahThread = new AnimalRacerThread("Cheetah", 50);

        System.out.println("On your marks, get set, go!");
        hareThread.start();
        try {
            hareThread.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted while joining");
        }
        tortoiseThread.start();
        cheetahThread.start();
    }
}