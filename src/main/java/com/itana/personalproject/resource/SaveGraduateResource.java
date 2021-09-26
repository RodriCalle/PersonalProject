package com.itana.personalproject.resource;

public class SaveGraduateResource {
    private int year;
    private String sex;
    private String typeOfCourse;
    private String noOfGraduates;

    public int getYear() {
        return year;
    }

    public SaveGraduateResource setYear(int year) {
        this.year = year;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public SaveGraduateResource setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getTypeOfCourse() {
        return typeOfCourse;
    }

    public SaveGraduateResource setTypeOfCourse(String typeOfCourse) {
        this.typeOfCourse = typeOfCourse;
        return this;
    }

    public String getNoOfGraduates() {
        return noOfGraduates;
    }

    public SaveGraduateResource setNoOfGraduates(String noOfGraduates) {
        this.noOfGraduates = noOfGraduates;
        return this;
    }
}
