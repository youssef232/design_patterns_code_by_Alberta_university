package composite_Assignment;

public class Song implements IComponent{
    public String songName;
    public String artist;
    public float speed = 1;


    public Song(String songName, String artist ) {
        this.songName = songName;
        this.artist = artist;
    }


    @Override
    public void play() {

    }

    @Override
    public void setPlaybackSpeed(float speed) {

    }

    @Override
    public String getName() {
        return songName;
    }

    public String getArtist() {
        return artist;
    }
}
