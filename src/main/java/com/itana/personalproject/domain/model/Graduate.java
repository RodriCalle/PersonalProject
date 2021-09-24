package com.itana.personalproject.domain.model;

import javax.persistence.*;
import java.time.Year;

@Table(name = "graduates")
@Entity
public class Graduate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private Year year;

    @Column
    private String sex;

    @Column
    private String typeOfCourse;

    @Column
    private Long noOfGraduates;

    public Graduate(Long id, Year year, String sex, String typeOfCourse, Long noOfGraduates) {
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

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
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

    public Long getNoOfGraduates() {
        return noOfGraduates;
    }

    public void setNoOfGraduates(Long noOfGraduates) {
        this.noOfGraduates = noOfGraduates;
    }
}