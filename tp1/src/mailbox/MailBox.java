package mailbox;

import java.util.ArrayList;
import java.util.List;

public class MailBox extends Subject {

	List<Mail> mail;
	private static MailBox instance = null;

	private MailBox() {
		this.mail = new ArrayList<Mail>();
		this.observers = new ArrayList<Observer>();
	}

	public static MailBox getInstance() {
		if (instance == null)
			instance = new MailBox();
		return instance;
	}
	
	public boolean isEmpty() {
		return this.mail.isEmpty();
	}
	
	public void addMail(Mail m) {
		this.mail.add(m);
		notifyObservers(m);
	}

	public Mail read() {
		if(isEmpty()) {
			return null;
		}
		
		return this.mail.get(mail.size() - 1);
	}

	public Integer getNbreMail() {
		return mail.size();
	}

	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers(Mail mail) {
		this.observers.forEach(o -> o.update(this, mail));
	}
}
