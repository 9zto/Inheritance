
/**
 * Write a description of class Cali here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cali extends Dog
{
    public Cali(int playfullness){
        super("Cali",2,"dog", playfullness);
        playfullness = 6;
    }
    public void play(){
        if(playfullness > 5){
            System.out.println("Cali wants to play with you!");
        }else{
            System.out.println("Cali doesn't want to play with you. :(");
        }
    }
}
