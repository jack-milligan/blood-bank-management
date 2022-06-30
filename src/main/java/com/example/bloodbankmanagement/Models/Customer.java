package com.example.bloodbankmanagement.Models;

import java.util.UUID;

public class Customer {
    private final UUID Customer_ID;
    private final String FName;
    private final String LName;
    private final int SSN;
    private final String Email;
    private final String BloodType;

    public Customer(UUID customer_id, String fName, String lName, int ssn, String email, String bloodType) {
        Customer_ID = customer_id;
        FName = fName;
        LName = lName;
        SSN = ssn;
        Email = email;
        BloodType = bloodType;

    }

    public UUID getCustomer_ID() {
        return Customer_ID;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public int getSSN() {
        return SSN;
    }

    public String getEmail() {
        return Email;
    }

    public String getBloodType() {
        return BloodType;
    }
}
