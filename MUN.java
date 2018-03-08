
/**
 * Write a description of class MUN here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MUN extends Club
{
    public MUN(String day, String job, int studentNum, String name, int time){
        super("Tuesday", "Delegate", 50, "MUN", 8);
    }
    public void meetDay(){
        if(day == Date.getDay() && time == Date.getHour()){
            System.out.println("You go to MUN");
        }else{
            System.out.println("You do not go to MUN");
        }
    }
}
