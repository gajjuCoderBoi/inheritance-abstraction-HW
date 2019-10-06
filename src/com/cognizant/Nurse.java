package com.cognizant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Nurse extends Staff {

    public List<String> getSpecialities() {
        return specialities;
    }

    private List<String> specialities;
    private Date shiftStart;
    private Date shiftEnd;


    public Nurse(String firstName, String lastName, Date DOB, char gender) {
        super(firstName, lastName, DOB, gender);
        setId(generateRandomID());
        specialities = new ArrayList<>();
    }

    @Override
    public UUID generateRandomID() {
        return UUID.randomUUID();
    }

    public void addSpeciality(String s) {
        specialities.add(s);
    }

    public Date getShiftStart() {
        return shiftStart;
    }

    public void setShiftStart(Date shiftStart) {
        this.shiftStart = shiftStart;
    }

    public Date getShiftEnd() {
        return shiftEnd;
    }

    public void setShiftEnd(Date shiftEnd) {
        this.shiftEnd = shiftEnd;
    }

    public String getSpeciality(){
        return specialities.stream()
                .map(spe -> spe)
                .collect(Collectors.joining());
    }


}
