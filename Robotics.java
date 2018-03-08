
/**
 * Write a description of class Robotics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robotics extends Club
{
    public Robotics(String day, String job, int studentNum, String name, int time){
        super("Friday", "Vice-President", 40, "Robotics", 4);
    }
    public void meetDay(){
        if(day == Date.getDay() && time == Date.getHour()){
            System.out.println("You go to Robotics.");
        }else{
            System.out.println("You do not go to Robotics.");
        }
    }
}
