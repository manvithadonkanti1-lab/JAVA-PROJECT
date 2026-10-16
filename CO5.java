import java.io.*;
import java.util.*;

public class CO5 {
    public static void main(String[] args) {
        String[] songs = {
            "Golden Hour",
            "Sunflower",
            "Perfect",
            "Levitating"
        };

        // Linear search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song to search: ");
        String key = sc.nextLine().toLowerCase();

        boolean found = false;

        for (String song : songs) {
            if (song.toLowerCase().contains(key)) {
                System.out.println("Found: " + song);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Song not found");
        }

        // Sorting
        Arrays.sort(songs, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted songs: " + Arrays.toString(songs));

        // File handling
        try (PrintWriter out = new PrintWriter("songs.txt")) {
            for (String song : songs) {
                out.println(song);
            }
            System.out.println("Songs saved to file.");
        } catch (IOException e) {
            System.out.println("File error.");
        }

        sc.close();
    }
}


