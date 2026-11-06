import java.util.Arrays;

/**
 * Week 7 Assignment 2 - The Playlist (returns a defensive copy of its songs)
 */
public class A2_Playlist {

    static class Playlist {
        private final String[] songs;
        private int songCount = 0;

        public Playlist(int maxSize) {
            this.songs = new String[maxSize];
        }

        public boolean addSong(String title) {
            if (songCount >= songs.length) {
                System.out.println("Playlist is full - cannot add " + title);
                return false;
            }
            songs[songCount++] = title;
            return true;
        }

        // A brand new array: changing it cannot touch the real playlist
        public String[] getSongs() {
            return Arrays.copyOf(songs, songCount);
        }

        public int getSongCount() { return songCount; }
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");
        String[] copy = p.getSongs();
        copy[0] = "Hacked";
        System.out.println("Modified copy: " + Arrays.toString(copy));
        System.out.println("p.getSongs()[0] is still: " + p.getSongs()[0]);
        System.out.println("Playlist contents: " + Arrays.toString(p.getSongs()) + " | count = " + p.getSongCount());
    }
}
