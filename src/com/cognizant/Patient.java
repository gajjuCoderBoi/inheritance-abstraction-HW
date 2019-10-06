package com.cognizant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Patient extends Person implements PatientInterface {


    private UUID id;
    private int age;
    private Date accepted;
    private List<MedicalCondition> medicalHistory;


    public Patient(String firstName, String lastName, Date DOB, char gender) {
        super(firstName, lastName, DOB, gender);
        setId(generateRandomID());
        medicalHistory = new ArrayList<MedicalCondition>();
    }


    @Override
    public UUID generateRandomID() {
        return UUID.randomUUID();
    }

    public Date getAccepted() {
        return accepted;
    }

    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public void addMedicalCondition(MedicalCondition mc) {
        medicalHistory.add(mc);
    }

    @Override
    public void deleteMedicalCondition(MedicalCondition mc) {
        medicalHistory.remove(mc);
    }

    @Override
    public List<MedicalCondition> getMedicalConditions() {
        return medicalHistory;
    }

    @Override
    public String printMedicalHistory() {
        return medicalHistory.stream()
                .map(medicalCondition -> {
                    return "\n\n-----------------------------------\n" +
                            medicalCondition.toString()
                            + "\n-----------------------------------";
                }).collect(Collectors.joining());
    }
}
