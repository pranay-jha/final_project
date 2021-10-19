package com.company.models;

public class Lecture extends Physical {

    public boolean[] daysOfTheWeek = new boolean[7];
    public boolean disc;

    public Lecture(String className, String prof, String desc, int time, int endTime, String room, boolean[] daysOfTheWeek, boolean disc) {
        super(String className, String prof, String desc, int time, int endTime, String room);
        this.daysOfTheWeek = daysOfTheWeek;
        this.disc = disc;
    }

    public boolean[] getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public boolean isDisc() {
        return disc;
    }

    public void setDaysOfTheWeek(boolean[] daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public void changeDisc(boolean disc) {
        this.disc = disc;
    }

}
