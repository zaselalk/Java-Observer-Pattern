/**
 * The Student class implements the Observer interface and represents a student in a Learning Management System (LMS).
 * It receives updates from the LMSAdmin and prints the subject (message) to the console.
 */
public class Student implements Observer {

    /**
     * This method is called when the subject's state changes.
     * It prints the subject (message) to the console.
     *
     * @param subject the subject whose state has changed
     */
    @Override
    public void update(Subject subject) {
        // Print the subject (message) to the console
        System.out.println(subject.getSubject());
    }
}
