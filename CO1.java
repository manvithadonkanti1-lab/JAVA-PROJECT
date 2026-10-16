import java.util.*;

public class CO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 3;
        double totalDuration = 11.8;
        char choice = 'y';
        boolean found = true;

        System.out.println("Songs in playlist: " + count);
        System.out.println("Total duration: " + totalDuration + " min");
        System.out.println("Add another song? " + choice);
        System.out.println("Song found: " + found);

        sc.close();
    }
}


