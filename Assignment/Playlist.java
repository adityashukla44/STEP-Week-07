import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int songCount;

    public Playlist(int maximumSize) {
        if (maximumSize < 0) {
            throw new IllegalArgumentException("Maximum size cannot be negative.");
        }
        songs = new String[maximumSize];
    }

    public void addSong(String song) {
        if (song == null || song.isBlank()) {
            System.out.println("Song not added: title cannot be empty.");
            return;
        }
        if (songCount == songs.length) {
            System.out.println("Song not added: playlist is full.");
            return;
        }
        songs[songCount++] = song;
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");
        String[] copy = p.getSongs();
        copy[0] = "Hacked";
        System.out.println("Returned copy: " + Arrays.toString(copy));
        System.out.println("Playlist contents: " + Arrays.toString(p.getSongs()));
        System.out.println("Song count: " + p.getSongCount());
    }
}
