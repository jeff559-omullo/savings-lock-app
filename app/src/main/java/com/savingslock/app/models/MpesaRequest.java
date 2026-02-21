package com.savingslock.app.models;

public class MpesaRequest {
    public String phoneNumber;
    public double amount;
    public String transactionDesc;
    public int savingsGoalId;

    public MpesaRequest(String phoneNumber, double amount, String transactionDesc, int savingsGoalId) {
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.transactionDesc = transactionDesc;
        this.savingsGoalId = savingsGoalId;
    }
}