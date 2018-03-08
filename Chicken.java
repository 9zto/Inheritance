
/**
 * Write a description of class Chicken here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chicken extends Pet
{
    public Chicken(int playfullness){
        super("Chicken", 1, "Chicken", playfullness);
    }
    public Chicken(){
        this(4);
    }

    public void pickUp(){
        if(playfullness > 3){
            System.out.println("You pick up the chicken.");
        }else{
            System.out.println("You don't pick up the chicken");
        }
    }
}
