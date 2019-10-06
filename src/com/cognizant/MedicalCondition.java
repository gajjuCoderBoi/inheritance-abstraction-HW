package com.cognizant;

import java.util.Date;

public class MedicalCondition
{
    private String nameOfCondition;
    Date dateOfReport;

    public MedicalCondition(String nameOfCondition,Date dateOfReport)
    {
        this.nameOfCondition = nameOfCondition;
        this.dateOfReport = dateOfReport;
    }

    public String toString()
    {
        return "Date: "+dateOfReport+"\nCondition:"+nameOfCondition;
    }
}
