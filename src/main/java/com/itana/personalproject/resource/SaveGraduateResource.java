package com.itana.personalproject.resource;

public class SaveGraduateResource {
    private int year;
    private String sex;
    private String typeOfCourse;
    private Long noOfGraduates;

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

    public Long getNoOfGraduates() {
        return noOfGraduates;
    }

    public SaveGraduateResource setNoOfGraduates(Long noOfGraduates) {
        this.noOfGraduates = noOfGraduates;
        return this;
    }
}
