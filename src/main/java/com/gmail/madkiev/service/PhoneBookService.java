package com.gmail.madkiev.service;

import com.gmail.madkiev.model.PhoneBook;

import java.util.List;

public interface PhoneBookService {

    PhoneBook getPhoneBook(String phonebook);
    List<PhoneBook> getAllPhoneBook();
    PhoneBook savePhoneBook(PhoneBook phoneBook);
    void deletePhoneBook(String phoneBookId);

}
