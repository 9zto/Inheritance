
/**
 * Write a description of class Cha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cha extends Enemy
{
    boolean angry;
    public Cha(){
        super(100, 5);
        this.angry = true;
    }
    public void yell(){
        if(angry){
            System.out.println("Cha yells");
        }else{
            System.out.println("Cha does not yell.");
        }
    }
}
