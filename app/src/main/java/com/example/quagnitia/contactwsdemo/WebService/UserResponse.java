package com.example.quagnitia.contactwsdemo.WebService;

import com.example.quagnitia.contactwsdemo.Contacts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V@iBh@V on 4/2/2018.
 */

public class UserResponse {
    List<Contacts> contacts=new ArrayList<>();

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }
}
