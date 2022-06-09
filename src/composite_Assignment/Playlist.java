package composite_Assignment;

import java.util.ArrayList;

public class Playlist implements IComponent{
    public String playlistName;
    ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        playlist = new ArrayList<>();
        this.playlistName = playlistName;
    }

    public void add (IComponent component){
        playlist.add(component);

    }
    public void remove(IComponent component){
        IComponent temp;
        playlist.removeIf(component::equals);
    }

    @Override
    public void play() {

    }

    @Override
    public void setPlaybackSpeed(float speed) {

    }

    @Override
    public String getName() {
        return playlistName;
    }
}
