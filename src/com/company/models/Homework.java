package com.company.models;

public class Homework extends Event {

    public int dueDay;
    public int dueMonth;
    public boolean recurring;

    public Homework(String className, String prof, String desc, int time, int dueDay, int dueMonth, boolean recurring) {
        super(String className, String prof, String desc, int time);
        this.dueDay = dueDay;
        this.dueMonth = dueMonth;
        this.recurring = recurring;
    }

    public int getDueDay() {
        return dueDay;
    }

    public int getDueMonth() {
        return dueMonth;
    }

    public boolean isRecurring() {
        return recurring;
    }

    public void setDueDay(int dueDay) {
        this.dueDay = dueDay;
    }

    public void setDueMonth(int dueMonth) {
        this.dueMonth = dueMonth;
    }

    public void changeRecurring(boolean recurring) {
        this.recurring = recurring;
    }

}
