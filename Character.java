
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Character implements DefenseCommands, WeaponInterface
{
    Feeling feel;
    String name;
    int age;
    public Character(String name,int age){
        this.name = name;
        this.age = age;
    }
}
