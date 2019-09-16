import java.util.ArrayList;

public class Watchman implements Subject {
    /**
     * Creates an ArrayList of Observers
     */
    ArrayList<Observer> observers;
    int warning = 0;

    public Watchman() {
        observers = new ArrayList<Observer>();
    }

    /**
     * registers the observers into the array list
     * @param observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * this issues the warning of which the observs in the array list observe
     * @param warning
     */
    public void issueWarning(int warning) {
        this.warning = warning;
        System.out.println("WARNING: "+ warning +" Trumpet was played!");
        notifyObservers();
    }

    /**
     * this is what notifies the observers to update
     */
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(warning);
        }
    }

    /**
     * removes observers
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
