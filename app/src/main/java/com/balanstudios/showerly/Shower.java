package com.balanstudios.showerly;

public class Shower {

    private long showerLengthMillis;
    private double showerLengthMinutes;
    private static double gallonsPerMinute = 2.1;
    private static double dollarsPerGallon = .0015;
    private double volume;
    private double cost;
    private String date;
    private String time;
    private boolean goalMet;

    public Shower(){
        showerLengthMillis = 0;
        showerLengthMinutes = 0;
        volume = 0;
        cost = 0;
        date = "";
        time = "";
        goalMet = false;
    }

    public Shower(long showerLengthMillis, String date, String time, boolean goalMet){
        this.showerLengthMillis = showerLengthMillis;
        showerLengthMinutes = (double)showerLengthMillis / 1000 / 60;
        volume = calculateVolume(showerLengthMinutes);
        cost = calculateCost(showerLengthMinutes);
        this.date = date;
        this.time = time;
        this.goalMet = goalMet;
    }

    public String toString(){
        String s = "Showered for " + showerLengthMinutes + " minutes on " + date + " at " + time + ". Volume: " + volume + " Cost: " + cost + " Goal Met: " + goalMet;
        return s;
    }



    public long getShowerLengthMillis() {
        return showerLengthMillis;
    }

    public void setShowerLengthMillis(long showerLengthMillis) {
        this.showerLengthMillis = showerLengthMillis;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public static double calculateVolume(double showerLengthMinutes){
        return showerLengthMinutes * gallonsPerMinute;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static double calculateCost(double volume){
        return volume * dollarsPerGallon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isGoalMet() {
        return goalMet;
    }

    public void setGoalMet(boolean goalMet) {
        this.goalMet = goalMet;
    }

    public double getShowerLengthMinutes() {
        return showerLengthMinutes;
    }

    public void setShowerLengthMinutes(double showerLengthMinutes) {
        this.showerLengthMinutes = showerLengthMinutes;
    }

    public double getGallonsPerMinute() {
        return gallonsPerMinute;
    }

    public void setGallonsPerMinute(double gallonsPerMinute) {
        this.gallonsPerMinute = gallonsPerMinute;
    }

    public double getDollarsPerGallon() {
        return dollarsPerGallon;
    }

    public void setDollarsPerGallon(double dollarsPerGallon) {
        this.dollarsPerGallon = dollarsPerGallon;
    }
}