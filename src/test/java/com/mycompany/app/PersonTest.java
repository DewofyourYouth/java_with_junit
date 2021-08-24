package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class PersonTest {
    @Test
    public void testFirstName() throws ParseException{
        Person js = new Person("Jacob", "Shore");
        assertEquals(js.firstName, "Jacob");
    }

    @Test
    public void testGetBirthday() throws ParseException{
        Person js = new Person("Jacob", "Shore");
        js.SetBirthday("07/05/1984");
        assertEquals(js.GetBirthday(), new SimpleDateFormat("MM/dd/yyyy").parse("07/05/1984"));

    }
}
