package com.project.services;

import java.util.List;
import com.project.form.Contact;

public interface ContactService {

	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(int id);
}
