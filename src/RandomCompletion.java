import java.util.Random;

public class RandomCompletion
 {
    public static void main( String[] args )
    {
        int dienumber;
        Random rnd = new Random();
        
        for (int i=0; i<100; i++){
        dienumber = 1 + rnd.nextInt(6);
        System.out.println("Your die roll was : " + dienumber);
        }
    }
 }