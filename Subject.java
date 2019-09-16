/**
 * Nicholas Yglesias
 * this interface holds the subject of the araylist of observers
 */

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
