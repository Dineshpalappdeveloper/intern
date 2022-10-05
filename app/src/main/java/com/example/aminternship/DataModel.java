package com.example.aminternship;

public class DataModel {
    private String name;
    private String email;
    private String collage;
    private String hobbes;
    private String Description;
    private String highsDegree;
    private String internshipType;

    public  DataModel(String name,String email,String collage,String hobbes , String Description,String highsDegree,String internshipType ){
        this.collage = collage;
        this.email = email;
        this.name = name;
        this.hobbes = hobbes;
        this.Description = Description;
        this.highsDegree = highsDegree;
        this.internshipType = internshipType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getHobbes() {
        return hobbes;
    }

    public void setHobbes(String hobbes) {
        this.hobbes = hobbes;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getHighsDegree() {
        return highsDegree;
    }

    public void setHighsDegree(String highsDegree) {
        this.highsDegree = highsDegree;
    }

    public String getInternshipType() {
        return internshipType;
    }

    public void setInternshipType(String internshipType) {
        this.internshipType = internshipType;
    }
}

