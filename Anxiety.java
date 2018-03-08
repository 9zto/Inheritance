
/**
 * Write a description of class Anxiety here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anxiety extends Enemy
{
    int power;
    public Anxiety(int dislikable, int strength, int power){
        super(dislikable,strength);
        this.power = power;
    }
}
