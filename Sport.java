
/**
 * Write a description of class Sports here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Sport extends Extracurricular
{
    int difficulty;
    public Sport(String name, int difficulty){
        super(name);
        this.difficulty = difficulty;
    }
}
