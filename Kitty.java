
/**
 * Write a description of class Kitty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kitty extends Cat
{
    public Kitty(int playfullness){
        super("Kitty", 10, "Cat", playfullness);
    }
    public void happyCat(){
        if(playfullness > 3){
            System.out.println("Kitty permits you to pet her.");
        } else{
            System.out.println("Kitty will scratch out your eyes if you touch her.");
        }
    }
}
