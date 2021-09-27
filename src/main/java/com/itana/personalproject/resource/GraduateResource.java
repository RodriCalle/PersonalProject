package com.itana.personalproject.resource;

public class GraduateResource {
    private Long id;
    private String year;
    private String sex;
    private String typeOfCourse;
    private String noOfGraduates;

    public Long getId() {
        return id;
    }

    public GraduateResource setId(Long id) {
        this.id = id;
        return this;
    }

    public String getYear() {
        return year;
    }

    public GraduateResource setYear(String year) {
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

    public String getNoOfGraduates() {
        return noOfGraduates;
    }

    public GraduateResource setNoOfGraduates(String noOfGraduates) {
        this.noOfGraduates = noOfGraduates;
        return this;
    }
}
