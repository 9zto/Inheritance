
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Pet extends Character
{
    String typeOfPet;
    int playfullness;
        public Pet(String name, int age, String typeOfPet, int playfullness){
        super(name, age);
        this.typeOfPet = typeOfPet;
        this.playfullness = playfullness;
    }
}
