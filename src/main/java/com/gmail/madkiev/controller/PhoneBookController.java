package com.gmail.madkiev.controller;

import com.gmail.madkiev.model.PhoneBook;

import java.util.List;

public interface PhoneBookController {

    PhoneBook getPhoneBook(String phoneBookId);
    List<PhoneBook> getAllPhoneBook();
    PhoneBook createPhoneBook(PhoneBook phoneBook);
    PhoneBook updatePhoneBook(String id, PhoneBook phoneBook);
    void deletePhoneBook(String phoneBookId);
}
