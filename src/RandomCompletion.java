import java.util.Random;

public class RandomCompletion
 {
    public static void main( String[] args )
    {
        int dienumber;
        Random rnd = new Random();
        
        dienumber = 1 + rnd.nextInt(6);
        System.out.println("Your die roll was : " + dienumber);
        
    }
 }
