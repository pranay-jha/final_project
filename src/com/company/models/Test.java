package com.company.models;

public class Test extends Physical {

    public int day;
    public int month;
    public String details;

    public Test(String className, String prof, String desc, int time, int endTime, String room, int day, int month) {
        super(String className, String prof, String desc, int time, int endTime, String room);
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }


}
