package com.example.model;

public class Product {
    private int pdThumb;
    private String pdName;
    private String pdAddress;
    private String pdDesciption;
    private double pdRate;
    private int pdCount;

    public Product(int pdThumb, String pdName, String pdAddress, String pdDesciption, double pdRate, int pdCount) {
        this.pdThumb = pdThumb;
        this.pdName = pdName;
        this.pdAddress = pdAddress;
        this.pdDesciption = pdDesciption;
        this.pdRate = pdRate;
        this.pdCount = pdCount;
    }

    public int getPdThumb() {
        return pdThumb;
    }

    public void setPdThumb(int pdThumb) {
        this.pdThumb = pdThumb;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public String getPdAddress() {
        return pdAddress;
    }

    public void setPdAddress(String pdAddress) {
        this.pdAddress = pdAddress;
    }

    public String getPdDesciption() {
        return pdDesciption;
    }

    public void setPdDesciption(String pdDesciption) {
        this.pdDesciption = pdDesciption;
    }

    public double getPdRate() {
        return pdRate;
    }

    public void setPdRate(double pdRate) {
        this.pdRate = pdRate;
    }

    public int getPdCount() {
        return pdCount;
    }

    public void setPdCount(int pdCount) {
        this.pdCount = pdCount;
    }
}
