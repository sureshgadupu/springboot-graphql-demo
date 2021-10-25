package com.fullstackcode.springboot.graphql.entity;

import java.time.LocalDate;

public class SubmittedEmployee {

    private String first_name;
    private String last_name;
    private Gender gender;
    private LocalDate birth_date;
    private LocalDate hire_date;
    private Integer deptId;


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public SubmittedEmployee(String first_name, String last_name, Integer deptId) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.deptId = deptId;
    }

    public SubmittedEmployee(String first_name, String last_name, Gender gender, LocalDate birth_date, LocalDate hire_date, Integer deptId) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.deptId = deptId;
    }

    public SubmittedEmployee() {
    }
}