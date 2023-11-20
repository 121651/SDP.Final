import java.util.ArrayList;
import java.util.List;
interface Observer {
    void update(String message);
}

class MultimediaPlayerObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer notified: " + message);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
