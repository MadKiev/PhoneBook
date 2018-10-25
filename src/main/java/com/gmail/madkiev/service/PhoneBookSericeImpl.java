package com.gmail.madkiev.service;

import com.gmail.madkiev.model.PhoneBook;
import org.springframework.beans.factory.annotation.Autowired;
import com.gmail.madkiev.repository.PhoneBookRepository;


import java.util.List;

public class PhoneBookSericeImpl implements PhoneBookService {
@Autowired
private PhoneBookRepository phoneBookRepository;
    @Override
    public PhoneBook getPhoneBook(String id) {
        return phoneBookRepository.findById(id)
                .orElseThrow(() ->new IllegalArgumentException("Phone number with ID = '" + id + "' not exist"));
    }
    @Override
    public List<PhoneBook> getAllPhoneBook() {
        return phoneBookRepository.findAll();
    }
    @Override
    public PhoneBook savePhoneBook(PhoneBook phoneBook) {
        return phoneBookRepository.save(phoneBook);
    }
    @Override
    public void deletePhoneBook(String id) {
        if(!phoneBookRepository.findById(id).isPresent()){
            throw new IllegalArgumentException("Post with ID = '" + id + "' not exist");
        }
        phoneBookRepository.deleteById(id);
    }


}
