package com.cognizant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class LabAssistant extends Staff {

    private List<String> techSpecialities;

    public LabAssistant(String firstName, String lastName, Date DOB, char gender) {
        super(firstName, lastName, DOB, gender);
        techSpecialities = new ArrayList<>();
        setId(generateRandomID());
    }

    public List<String> getTechSpecialities() {
        return techSpecialities;
    }

    public void setTechSpecialities(List<String> techSpecialities) {
        this.techSpecialities = techSpecialities;
    }

    public void addSpeciality(String s) {
        techSpecialities.add(s);
    }


    @Override
    public UUID generateRandomID() {
        return UUID.randomUUID();
    }
}
