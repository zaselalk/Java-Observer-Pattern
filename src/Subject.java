/**
 * The Subject interface defines methods for registering, removing, and notifying observers.
 * Implementing classes should provide their own implementation of these methods to manage the observers.
 */
public interface Subject {

    /**
     * Registers an observer to the list of observers.
     *
     * @param observer the observer to be registered
     */
    void registerObserver(Observer observer);

    /**
     * Removes an observer from the list of observers.
     *
     * @param observer the observer to be removed
     */
    void removeObserver(Observer observer);

    /**
     * Notifies all registered observers with a given message.
     *
     * @param message the message to be sent to all observers
     */
    void notifyObservers(String message);

    /**
     * Returns the current subject (message) of the Subject.
     *
     * @return the current subject
     */
    String getSubject();
}
