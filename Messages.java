/* Messages.java */
public class Messages {
    public String morning;
    public String afternoon;
    public String evening;
    public String night;

    public Messages() {
      morning = "Good morning!";
      afternoon = "Good afternnon!";
      evening = "Good evening!";
      night = "Good night!";
    }

    public String getMessage(int choice) {
      switch(choice) {
         case 0:
           return this.morning;
         case 1:
           return this.afternoon;
         case 3:
           return this.evening;
         case 4:
           return this.night;
         default:
           return "";        
      }
    }
 }
