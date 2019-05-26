package mailbox;

import java.util.List;

abstract public class Subject {
	public List<Observer> observers;
	
	public abstract void attach(Observer observer);
	public abstract void detach(Observer observer);
	public abstract void notifyObservers(Mail m);
}
