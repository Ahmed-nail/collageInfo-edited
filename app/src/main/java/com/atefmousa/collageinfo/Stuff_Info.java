package com.atefmousa.collageinfo;

import androidx.annotation.NonNull;

public class Stuff_Info {

    private String name ;
    private String email ;
    private String phone_number ;

    public Stuff_Info(String name, String email, String phone_number) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
    }

    @NonNull
    @Override
    public String toString() {
        return "name : "+ name + "\nemail : " + email + "\nphone number : " + phone_number;
    }
}
