package mailbox;

import javax.swing.JLabel;

public class MailObserver extends JLabel implements Observer {
	
	private static final long serialVersionUID = 1L;

	public MailObserver() {
	}
	
	@Override
	public void update(Subject subject, Mail mail) {
		this.setText("Message reçu : " + mail.getSubject());
	}

}
