
/**
 * Write a description of class Club here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Club extends Extracurricular
{
    String job;
    int studentNum;
    public Club(String day, String job, int studentNum, String name, int time){
        super(name, day, time);
        this.job = job;
        this.studentNum = studentNum;
    }public void meetDay(){
        if(day == Date.getDay() && time == Date.getHour()){
            System.out.println("You go to the club");
        }else{
            System.out.println("You do not go to the club");
        }
    }
}
