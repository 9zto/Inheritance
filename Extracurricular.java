
/**
 * Write a description of class Extracurriculars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Extracurricular
{
    String name;
    String day;
    int time;
    public Extracurricular(String name, String day, int time){
        this.name = name;
        this.day = day;
        this.time = time;
    }
}
