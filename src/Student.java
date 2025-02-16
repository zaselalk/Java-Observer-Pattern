public class Student implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println(subject.getSubject());
    }
}
