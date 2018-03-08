
/**
 * Write a description of class CoderGirlz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoderGirlz extends Club
{
    public CoderGirlz(String day, String job, int studentNum, String name, int time){
        super("Friday", "Head Programmer", 5, "Coder Girlz", 11);
    }
    public void meetDay(){
        if(day == Date.getDay() && time == Date.getHour()){
            System.out.println("You go to Coder Girlz");
        }else{
            System.out.println("You do not go to Coder Girlz");
        }
    }
}
