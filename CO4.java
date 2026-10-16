class Song {
    private String title;
    private String artist;
    private double duration;

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }
}

public class CO4 {
    public static void main(String[] args) {
        Song s = new Song("Golden Hour", "JVKE", 3.5);

        System.out.println("Title: " + s.getTitle());
        System.out.println("Artist: " + s.getArtist());
        System.out.println("Duration: " + s.getDuration());
    }
}


