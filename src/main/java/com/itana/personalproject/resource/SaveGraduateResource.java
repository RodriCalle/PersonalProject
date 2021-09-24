package com.itana.personalproject.resource;

import java.time.Year;

public class SaveGraduateResource {
    private Year year;
    private String sex;
    private String typeOfCourse;
    private Long noOfGraduates;

    public Year getYear() {
        return year;
    }

    public SaveGraduateResource setYear(Year year) {
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
