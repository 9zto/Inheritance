
/**
 * Write a description of class Saxon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Saxon extends Dog
{
    public Saxon(int playfullness){
        super("Saxon",4,"dog", playfullness);
        playfullness = 5;
    }
    public void bark(){
        if(playfullness > 4){
            System.out.println("Saxon barks.");
        }else{
            System.out.println("Saxon doesn't bark.");
        }
    }
}
