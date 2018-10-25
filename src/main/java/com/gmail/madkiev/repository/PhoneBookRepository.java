package com.gmail.madkiev.repository;

import com.gmail.madkiev.model.PhoneBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneBookRepository extends JpaRepository<PhoneBook, String> {

    List<PhoneBook> findAllByOwnerId(String ownerId);
}
