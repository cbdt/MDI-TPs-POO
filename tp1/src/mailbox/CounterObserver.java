package mailbox;

import javax.swing.JLabel;

public class CounterObserver extends JLabel implements Observer {

	private static final long serialVersionUID = 1L;
	private int counter;
	
	public CounterObserver() {
		this.counter = 0;
	}
	
	@Override
	public void update(Subject subject, Mail mail) {
		this.counter++;
		this.setText(Integer.toString(this.counter));
	}

}
