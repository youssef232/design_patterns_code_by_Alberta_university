package Observer_pattern;

public class Follower implements IObserver{
    String followerName;

    public void play(){

    }

    @Override
    public void update(String user) {
        System.out.println("yay, "+ user + " has joined");
    }
}
