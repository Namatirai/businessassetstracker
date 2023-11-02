package com.bat.bat;

public class Asset {
    private String name;

    private double initialcost;

    private double weeklyexpenditure;

    private double weeklylosses;

    private double weeklysales;


    public Asset() {
    }

    public Asset(String name,
                 double initialcost,
                 double weeklyexpenditure,
                 double weeklylosses,
                 double weeklysales) {
        this.name = name;
        this.initialcost = initialcost;
        this.weeklyexpenditure = weeklyexpenditure;
        this.weeklylosses = weeklylosses;
        this.weeklysales = weeklysales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialcost() {
        return initialcost;
    }

    public void setInitialcost(double initialcost) {
        this.initialcost = initialcost;
    }

    public double getWeeklyexpenditure() {
        return weeklyexpenditure;
    }

    public void setWeeklyexpenditure(double weeklyexpenditure) {
        this.weeklyexpenditure = weeklyexpenditure;
    }

    public double getWeeklylosses() {
        return weeklylosses;
    }

    public void setWeeklylosses(double weeklylosses) {
        this.weeklylosses = weeklylosses;
    }

    public double getWeeklysales() {
        return weeklysales;
    }

    public void setWeeklysales(double weeklysales) {
        this.weeklysales = weeklysales;
    }

    public double calculateweeklyprofit(){
        return (weeklysales-(weeklyexpenditure+weeklylosses));
    }
}
