package com.cognizant;

import java.util.Date;

public abstract class Person implements PersonInterface {

    private String firstName;
    private String lastName;
    private Date DOB;
    private char gender;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Person(String firstName, String lastName, Date DOB, char gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setDOB(DOB);
        setGender(gender);

    }

    @Override
    public String fullName() {
        return firstName+" "+lastName;
    }

    @Override
    public String calAGE() {
        return null;
    }
}
