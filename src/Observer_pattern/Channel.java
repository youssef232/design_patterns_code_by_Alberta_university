package Observer_pattern;

import java.util.ArrayList;

public class Channel implements ISubject{

    ArrayList<IObserver> observers;
    public String channel_name;
    public String status;


    @Override
    public void registerObserver(IObserver observer) {

    }

    @Override
    public void deleteObserver(IObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
