package com.ayh.Assignment1.service;

import com.ayh.Assignment1.model.Contact;
import com.ayh.Assignment1.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepo;

    public List<Contact> getAllContacts() {
        return contactRepo.findAll(); // maps all json objects to java??
    }

    public List<Contact> filteredContacts(String query) {
        List<Contact> allContacts = getAllContacts();
        System.out.println("All Contacts in DB: " + allContacts);
        System.out.println("Search Query: " + query);

        List<Contact> filteredContacts = new ArrayList<>();

        for(Contact contact : allContacts) {
            if (contact.getFullName().toLowerCase().contains(query) ||
                    contact.getPhoneNum().contains(query) ||
                    contact.getLocation().toLowerCase().contains(query)) {

                filteredContacts.add(contact); // add contact to list if contains query
            }
        }
        return filteredContacts;
    }

    public void addContact(Contact contact) {
        contactRepo.save(contact);
    }
}
