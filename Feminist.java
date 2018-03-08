
/**
 * Write a description of class Feminist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Feminist extends Club
{
    public Feminist(){
        super("Monday", "Social Media", 12, "Feminist Club", 11);
    }
    public void meetDay(){
        if(day == Date.getDay() && time == Date.getHour()){
            System.out.println("You go to Feminist Club");
        }else{
            System.out.println("You do not go to Feminist Club");
        }
    }
}
