package com.cognizant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Doctor extends Staff {

    private List<String> specialities;
    private List<String> locations;

    public Doctor(String firstName, String lastName, Date DOB, char gender) {
        super(firstName, lastName, DOB, gender);
        setId(generateRandomID());
        specialities = new ArrayList<>();
        locations = new ArrayList<>();
    }

    @Override
    public UUID generateRandomID() {
        return UUID.randomUUID();
    }

    public void addSpeciality(String s){
        specialities.add(s);
    }

    public void addLocation(String l){
        locations.add(l);
    }
}
