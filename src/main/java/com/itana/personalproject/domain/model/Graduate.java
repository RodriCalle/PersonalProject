package com.itana.personalproject.domain.model;

import javax.persistence.*;

@Table(name = "graduates")
@Entity
public class Graduate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    private Long id;

    @Column(name = "year")
    private String year;

    @Column(name = "sex")
    private String sex;

    @Column(name = "type_of_course")
    private String typeOfCourse;

    @Column(name = "no_of_graduates")
    private String noOfGraduates;

    public Graduate(Long id, String year, String sex, String typeOfCourse, String noOfGraduates) {
        this.id = id;
        this.year = year;
        this.sex = sex;
        this.typeOfCourse = typeOfCourse;
        this.noOfGraduates = noOfGraduates;
    }

    public Graduate() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTypeOfCourse() {
        return typeOfCourse;
    }

    public void setTypeOfCourse(String typeOfCourse) {
        this.typeOfCourse = typeOfCourse;
    }

    public String getNoOfGraduates() {
        return noOfGraduates;
    }

    public void setNoOfGraduates(String noOfGraduates) {
        this.noOfGraduates = noOfGraduates;
    }
}