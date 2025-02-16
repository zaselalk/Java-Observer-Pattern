import java.util.ArrayList;
import java.util.List;

/**
 * The LMSAdmin class implements the Subject interface and represents an administrator in a Learning Management System (LMS).
 * It maintains a list of observers (students) and notifies them of any updates.
 */
public class LMSAdmin implements Subject {
    private final List<Observer> observers;
    private String subject;

    /**
     * Constructor for the LMSAdmin class.
     * Initializes the list of observers.
     */
    public LMSAdmin() {
        observers = new ArrayList<>();
    }

    /**
     * Registers an observer to the list of observers.
     *
     * @param observer the observer to be registered
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list of observers.
     *
     * @param observer the observer to be removed
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Returns the current subject (message) of the LMSAdmin.
     *
     * @return the current subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Notifies all registered observers with a given message.
     * Updates the subject with the provided message.
     *
     * @param message the message to be sent to all observers
     */
    @Override
    public void notifyObservers(String message) {
        this.subject = message;
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
