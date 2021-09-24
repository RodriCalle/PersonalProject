package com.aitana.personalproject.resource;

import java.time.Year;

public class GraduateResource {
    private Long id;
    private Year year;
    private String sex;
    private String typeOfCourse;
    private Long noOfGraduates;

    public Long getId() {
        return id;
    }

    public GraduateResource setId(Long id) {
        this.id = id;
        return this;
    }

    public Year getYear() {
        return year;
    }

    public GraduateResource setYear(Year year) {
        this.year = year;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public GraduateResource setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getTypeOfCourse() {
        return typeOfCourse;
    }

    public GraduateResource setTypeOfCourse(String typeOfCourse) {
        this.typeOfCourse = typeOfCourse;
        return this;
    }

    public Long getNoOfGraduates() {
        return noOfGraduates;
    }

    public GraduateResource setNoOfGraduates(Long noOfGraduates) {
        this.noOfGraduates = noOfGraduates;
        return this;
    }
}
