/* AnimalRacerThread.java */
public class AnimalRacerThread extends Thread {
    public static final int NUM_LAPS = 8;
    private String animalName;
    private int animalSpeed;

    public AnimalRacerThread(String animalName, int animalSpeed) {
        this.animalName = animalName;
        this.animalSpeed = animalSpeed;
    }

    @Override
    public void run() {
        for (int i = 1; i <= NUM_LAPS; i++) {
            System.out.println(animalName + " lap " + i);
            try {
                Thread.sleep(1000 / animalSpeed);
            } catch (InterruptedException e) {
                System.out.println("Interrupted while sleeping...");
            }
        }
        System.out.println(animalName + "Finished!");
    }
}
