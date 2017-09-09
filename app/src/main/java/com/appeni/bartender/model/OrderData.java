package com.appeni.bartender.model;

/**
 * Created by Davit on 7/28/17.
 */

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderData {

    @SerializedName("date")
    @Expose
    private String date;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @SerializedName("time")

    @Expose
    private String time;
    @SerializedName("medication_name")
    @Expose
    private String medicationName;
    @SerializedName("dosage")
    @Expose
    private String dosage;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("delivery_option")
    @Expose
    private String deliveryOption;
    @SerializedName("medication_instruction")
    @Expose
    private String medicationInstruction;
    @SerializedName("amount_of_pills")
    @Expose
    private String amountOfPills;
    @SerializedName("approved_by")
    @Expose
    private String approvedBy;

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    @SerializedName("doctor")

    @Expose
    private String doctor;
    @SerializedName("special_notes")
    @Expose
    private String specialNotes;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    public String getMedicationInstruction() {
        return medicationInstruction;
    }

    public void setMedicationInstruction(String medicationInstruction) {
        this.medicationInstruction = medicationInstruction;
    }

    public String getAmountOfPills() {
        return amountOfPills;
    }

    public void setAmountOfPills(String amountOfPills) {
        this.amountOfPills = amountOfPills;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}