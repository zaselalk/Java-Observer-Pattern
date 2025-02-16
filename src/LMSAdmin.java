import java.util.ArrayList;
import java.util.List;

public class LMSAdmin implements Subject{
    private final List<Observer> observers;
    private String subject;

  public LMSAdmin(){
      observers = new ArrayList<>();
  }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getSubject() {
      return subject;
    }

    @Override
    public void notifyObservers(String message) {
      this.subject = message;
        for(Observer observer:observers){
            observer.update(this);
        }
    }
}
