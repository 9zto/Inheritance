
/**
 * Write a description of class Club here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Club extends Extracurricular
{
    String day;
    String job;
    int studentNum;
    String time;
    public Club(String day, String job, int studentNum, String name, String time){
        super(name);
        this.day = day;
        this.job = job;
        this.studentNum = studentNum;
        this.time = time;
    }
}
