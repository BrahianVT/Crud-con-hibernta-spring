package com.project.dao;
import java.util.List;

import com.project.form.Contact;

public interface ContactDao {

	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(int id);
}
