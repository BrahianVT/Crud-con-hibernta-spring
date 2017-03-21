package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.ContactDao;
import com.project.form.Contact;
@Service
public class ContacServiceImp implements ContactService{
	
	@Autowired
	 private ContactDao contactDAO;
	@Transactional
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}
	
	@Transactional
	public List<Contact> listContact() {
		return contactDAO.listContact();
	}

	@Transactional
	public void removeContact(int id) {
		contactDAO.removeContact(id);
	}

}
