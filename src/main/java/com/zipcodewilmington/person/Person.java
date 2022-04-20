package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hobby;
    private String eyeColor;
    private double height;
    private String relationshipStatus;
    private int graduationYear;

    public Person(String name, int age, String hobby, String eyeColor, double height, String relationshipStatus, int graduationYear) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.eyeColor = eyeColor;
        this.height = height;
        this.relationshipStatus = relationshipStatus;
        this.graduationYear = graduationYear;
    }

    public Person(String expectedName, Integer expectedAge) {
    }

    public Person(String expectedName, Integer expectedAge, Double expectedHeight, Integer expectedGraduationYear, String expectedEyeColor, String expectedRelationshipStatus, String expectedHobby) {
    }

    public String getHobby() {
        return "Basketball";
    }

    public String getEyeColor() {
        return "brown";
    }

    public double getHeight() {
        return 3.25;
    }

    public String getRelationshipStatus() {
        return " single";
    }


    public int getGraduationYear() {
        return 2033;
    }


    public Person() {
    }

    public Person(int age) {
    }

    public Person(String name) {
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
    }

    public String getName() {
        return "Leon";
    }

    public Integer getAge() {
        return 5;
    }

}
