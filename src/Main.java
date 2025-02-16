//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        LMSAdmin lmsAdmin = new LMSAdmin();
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
        }

//        add all students as observers
        for (int i = 0; i < 10; i++) {
            lmsAdmin.registerObserver(students[i]);
        }

        // send update
        lmsAdmin.notifyObservers("Hello World");
    }
}