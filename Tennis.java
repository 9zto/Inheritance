
/**
 * Write a description of class Tennis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tennis extends Sport
{
    public Tennis(){
        super("Tennis", "Monday", 5, 6);
    }
    public void energy(){
        if(difficulty > 5){
            System.out.print("You get tired.");
        }else{
            System.out.print("You are energized.");
        }
    }
}
