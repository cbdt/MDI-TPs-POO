package mailbox;

interface Observer {
	void update(Subject subject, Mail mail);
}
