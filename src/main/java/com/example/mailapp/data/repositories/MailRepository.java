package com.example.mailapp.data.repositories;

import com.example.mailapp.data.models.Mail;

import java.util.List;

public interface MailRepository {
    Mail saveMail(Mail mail);
    Mail findById(Long id);
    void deleteById(Long id);
    void deleteAll();
    List<Mail> findAll();

}
