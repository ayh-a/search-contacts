package com.ayh.Assignment1.repository;

import com.ayh.Assignment1.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {

}
