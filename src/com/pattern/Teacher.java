package com.pattern;

/**
 * 老师
 */
public class Teacher extends Person{
    private String number;//工号

    public Teacher(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
