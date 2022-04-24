package com.ishan.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kshenuka created on 4/15/2022
 */
@RestController
public class ContactController {

    @GetMapping("/contact")
    public String getContacts(String input){
        return "This is our Contacts";
    }
}
