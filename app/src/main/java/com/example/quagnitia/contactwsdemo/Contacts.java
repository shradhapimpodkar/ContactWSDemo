package com.example.quagnitia.contactwsdemo;

import com.example.quagnitia.contactwsdemo.WebService.PhoneContact;

/**
 * Created by V@iBh@V on 4/2/2018.
 */

public class Contacts {
    String name="";
    String email="";
    String mobile="";

    PhoneContact phone=new PhoneContact();

    public PhoneContact getPhone() {
        return phone;
    }

    public void setPhone(PhoneContact phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
