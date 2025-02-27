package com.company;

public class Volvo extends Car{
    double price;
    String productionYear;
    String registrationNumber;
    Engine eng;
    DashBoard db;
    public Volvo(double price, String productionYear, String registrationNumber, Engine eng, DashBoard db){
        this.price=price;
        this.productionYear=productionYear;
        this.registrationNumber=registrationNumber;
        this.eng=eng;
        this.db=db;
    }
    public void changeFuel(){
        System.out.println("Changing Fuel");
    }
    public void checkBattery(){
        System.out.println("Checking battery");
    }
    public void display(){
        System.out.println(eng.capacity);
        System.out.println(db.size);
    }
}