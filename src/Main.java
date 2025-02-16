/**
 * The Main class demonstrates the usage of the Observer pattern in a Learning Management System (LMS).
 * It creates an LMSAdmin and a list of students, registers the students as observers, and sends an update to all observers.
 */
public class Main {

    /**
     * The main method is the entry point of the application.
     * It creates an LMSAdmin and a list of students, registers the students as observers, and sends an update to all observers.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an array of 10 students
        Student[] students = new Student[10];

        // Create an LMSAdmin instance
        LMSAdmin lmsAdmin = new LMSAdmin();

        // Initialize the students array with Student objects
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
        }

        // Register all students as observers
        for (int i = 0; i < 10; i++) {
            lmsAdmin.registerObserver(students[i]);
        }

        // Send an update to all observers
        lmsAdmin.notifyObservers("Hello World");
    }
}
