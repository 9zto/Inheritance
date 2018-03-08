
/**
 * Write a description of class Saxon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Saxon extends Dog
{
    public Saxon(String name, int age, String typeOfPet, int playfullness){
        super(name,age,typeOfPet, playfullness);
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
