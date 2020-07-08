package com.codedifferently.stayready;

public class Main {
    public double dollToEuro(double money){
        double euro = money * .94;
        return euro;
    }

   
    public double euroToDoll(double money){
        double dollar = money * (1/.94);
        return dollar;
    }

    public double euroToPound(double money){
        double pound = money * (0.82/0.94);
        // pound/euro
        return pound;
    }

    public double poundToRupee(double money){
        // Rupee / pound
        double Rupee = money * (68.32/0.82);
        return Rupee;
    }

    public double rupeeToCan(double money){
        double can = money * (1.32/68.32);
        //Can / rupee
        return can;
    }

    public double canToSing(double money){
        //Sing / Can
         double sing = money * (1.43/1.32);
        return sing;
        
    }

    public double singToFrank(double money){
        // Frank / sing
        double frank = money * (1.01/1.43);
        return frank;
    }

    public double frankToRing(double money){
        // Ring / frank
        double ring = money * (4.47/1.01);
        return ring;
    }

    public double ringToYen(double money){
        // Yen / ring
        double yen = money * (115.84/4.47);
        return yen;
    }

    public double yenToYuan(double money){
        double yuan = money *(6.92 /115.84);
        // Yuan / Yen
        return yuan;
    }


}
