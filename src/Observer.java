/**
 * The Observer interface defines the update method, which is called when the subject's state changes.
 * Implementing classes should provide their own implementation of the update method to handle the state change.
 */
public interface Observer {

    /**
     * This method is called when the subject's state changes.
     * Implementing classes should provide their own implementation to handle the state change.
     *
     * @param subject the subject whose state has changed
     */
    void update(Subject subject);
}
