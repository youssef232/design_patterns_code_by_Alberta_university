package Observer_pattern;

public interface ISubject {
    public void registerObserver(IObserver observer);
    public void deleteObserver(IObserver observer);
    public void notifyObservers();
}
