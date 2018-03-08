
/**
 * Abstract class Date - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Date
{
    static String[] days = {"Monday", "Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday"};
    static int currentIndex = 0;
    static String date = days[currentIndex];
    
    
    static int hour = 0;
    static int min = 0;
    

    public static void nextDay(){
        currentIndex++;
        currentIndex %= days.length;
        date = days[currentIndex];
    }
    public static String getDay(){
     return date; 
    }
    public static int getHour(){
     return hour; 
    }
    public static int getMin(){
     return min; 
    }
    public static void hourLater(){
        hour++;
        if (hour > 23){
            hour %= 24;
            nextDay();
        }
    }
    public static void minuteLater(){
        min++;
        if (min > 59){
            min %= 60;
            hourLater();
        }
    }
}
