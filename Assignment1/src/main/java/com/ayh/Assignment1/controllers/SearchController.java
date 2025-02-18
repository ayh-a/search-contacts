package com.ayh.Assignment1.controllers;

import com.ayh.Assignment1.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ayh.Assignment1.service.ContactService;

import java.util.List;

@RestController
@CrossOrigin
public class SearchController {

    @Autowired
    ContactService service;

    @GetMapping("/search")
    public List<Contact> searchResults(@RequestParam("value") String query) {
        return service.filteredContacts(query);
    }

    @GetMapping("/getContacts")
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }

    @PostMapping("/addContact")
    public Contact addContact(@RequestBody Contact contact) {
        service.addContact(contact);
        return contact;
    }
}
