
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Dog extends Pet
{
    public Dog(String name, int age, String typeOfPet, int playfullness){
        super(name,age,typeOfPet, playfullness);
        typeOfPet = "dog";
    }  
    
}
