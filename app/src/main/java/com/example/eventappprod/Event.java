package com.example.eventappprod;

public class Event {
    private String Name;
    private String Date;
    private String Location;
    private String StartTime;
    private String EndTime;
    private String Tag;



    public Event() {

    }

    public Event(String name, String date, String loca, String stime, String etime, String tag) {
        Name = name;
        Date = date;
        Location = loca;
        Tag =tag;
        StartTime =stime;
        EndTime = etime;
    }

    public String getName(){
        return Name;
    }
    public void setName(String n){
        Name = n;
    }

    public String getDate(){
        return Date;
    }
    public void setDate(String d){
        Date = d;
    }

    public String getLocation(){
        return Location;
    }
    public void setLocation(String l){ Location = l; }

    public String getStartTime(){
        return StartTime;
    }
    public void setStartTime(String t){
        StartTime = t;
    }

    public String getEndTime(){
        return EndTime;
    }
    public void setEndTime(String t){
        EndTime = t;
    }

    public String getTag(){
        return Tag;
    }
    public void setTag(String t){
        Tag =t;
    }

}
