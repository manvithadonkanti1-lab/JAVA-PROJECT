 
public class CO3 {

    static void displaySongs(String[] songs) {
        if (songs.length == 0) {
            System.out.println("Playlist is empty.");
            return;
        }

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i]);
        }
    }

    static double totalDuration(double[] durations) {
        double total = 0;

        for (int i = 0; i < durations.length; i++) {
            total += durations[i];
        }

        return total;
    }

    public static void main(String[] args) {
        String[] songs = {
            "Golden Hour",
            "Sunflower",
            "Perfect"
        };

        double[] durations = {3.5, 3.9, 4.4};

        displaySongs(songs);

        System.out.println("Total duration: "
                + totalDuration(durations) + " minutes");
    }
}

    

