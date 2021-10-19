package com.company.models;

public abstract class Physical extends Event {

    private int endTime;
    private String room;

    public Physical(String className, String prof, String desc, int time, int endTime, String room) {
        super(className, prof, desc, time);
        this.endTime = endTime;
        this.room = room;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getRoom() {
        return room;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void setRoom(String room) {
        this.room = room;
    }

}
