package com.cognizant;

import java.util.UUID;

public interface PersonInterface {
    public String fullName();
    public String calAGE();
    public UUID generateRandomID();
    enum Gender{
        Male, Female
    }
}
