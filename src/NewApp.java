import java.util.Random;
public class NewApp {
    public static void main(String[] args) {
    int min=1;
    int max = 6;

    Random random = new Random();
    for (int i = 0; i < 10; i++) {
        int randomNumber = random.nextInt(max-min+1)+min;
        System.out.println(""+ randomNumber);
        
    }

    }
}
