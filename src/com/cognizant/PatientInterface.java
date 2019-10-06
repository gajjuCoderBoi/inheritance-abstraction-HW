package com.cognizant;

import java.util.List;

public interface PatientInterface {
    public void addMedicalCondition(MedicalCondition mc);
    public void deleteMedicalCondition(MedicalCondition mc);
    public List<MedicalCondition> getMedicalConditions();
    public String printMedicalHistory();

}
