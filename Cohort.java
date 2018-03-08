
/**
 * Write a description of class Cohort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cohort extends Club
{
    public Cohort(String day, String job, int studentNum, String name, int time){
        super("Wednesday", "President", 20, "Cohort", 4);
    }
    public void meetDay(){
        if(day == Date.getDay() && time == Date.getHour()){
            System.out.println("You go to Cohort");
        }else{
            System.out.println("You do not go to Cohort");
        }
    }
}
