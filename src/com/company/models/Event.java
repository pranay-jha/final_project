package com.company.models;

public abstract class Event {

    private String className;
    private String prof;
    private String desc;
    private int time;

    public Event(String className, String prof, String desc, int time) {
        this.className = className;
        this.prof = prof;
        this.desc = desc;
        this.time = time;
    }

    public String getClassName() {
        return className;
    }

    public String getProf() {
        return prof;
    }

    public String getDesc() {
        return desc;
    }

    public int getTime() {
        return time;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
