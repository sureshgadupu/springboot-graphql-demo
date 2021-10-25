package com.fullstackcode.springboot.graphql.entity;

public class SubmittedDepartment {

    private String name;

    public SubmittedDepartment(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}