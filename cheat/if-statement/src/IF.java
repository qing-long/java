import java.util.Random;

public class IF {
    public static void main(String[] args) {
       Integer random = new Random().nextInt(10);

       if (random > 5) {
           System.out.println("random > 5");
       }
       else if (random < 3) {
           System.out.println("random > 7");
       }
       else {
           System.out.println("random >= 3 <= 5");
       }
    }
}
