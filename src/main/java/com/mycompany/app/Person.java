package com.mycompany.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    String firstName;
    String lastName;
    Date birthday;

    public Person(String fname, String lname) {
        firstName = fname;
        lastName  = lname;
    }

    public void Greet(){
        System.out.println("Greetings, "  + firstName + " " + lastName + "!");
    }

    public Date GetBirthday(){
        return birthday;
    }

    public void SetBirthday(String birthdayString){
        try {
            birthday = (Date) new SimpleDateFormat("MM/dd/yyyy").parse(birthdayString);
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }
}