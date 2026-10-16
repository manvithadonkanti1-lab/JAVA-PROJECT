import java.util.*;

public class CO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Song");
            System.out.println("2. Display Songs");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Song added!");
                    break;
                case 2:
                    System.out.println("Displaying songs...");
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
 

