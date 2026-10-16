import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CO6 {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();

        songs.add("Golden Hour");
        songs.add("Sunflower");
        songs.add("Perfect");
        songs.add("Levitating");

        // Display using a lambda
        songs.forEach(s -> System.out.println(s));

        // Filter songs containing "love"
        Predicate<String> condition =
                s -> s.toLowerCase().contains("love");

        List<String> result = songs.stream()
                .filter(condition)
                .collect(Collectors.toList());

        System.out.println("Matching songs: " + result);

        // Sort songs
        songs.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted: " + songs);

        // Count songs
        long count = songs.stream().count();
        System.out.println("Total songs: " + count);
    }
}


