package com.codedifferently.stayready;

import org.junit.Assert;
import org.junit.Test;



public class MainTest {

    @Test
    public void dollToEuroTest(){
        //Given
        Main doll = new Main();
        double expected = doll.dollToEuro(1);
        //when
        double actual = .94; 
        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void euroToDollTest(){
        //Given
        Main euro = new Main();
        double expected = euro.euroToDoll(.94);

        //When
        double actual= 1.00; 

        //Then
        Assert.assertEquals(expected, actual, 0.01);
         
    }

    @Test
    public void euroToPoundTest(){
        //Given
        Main euro = new Main();
        //When
        double expected = euro.euroToPound(.94);
        double actual = .82; // doll/1

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void poundToRupeeTest(){
        //Given
        Main pound = new Main();
        //When
        double expected = pound.poundToRupee(.82);
        double actual = 68.32; // rupee/1

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void rupeeToCanTest(){
        //Given
        Main rupee = new Main();
        //When
        double expected = rupee.rupeeToCan(68.32);
        double actual = 1.32; // can/1

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void canToSingTest(){
        //Given
        Main can = new Main();
        //When
        double expected = can.canToSing(1.32);
        double actual = 1.43; // sing/1
        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void singToFrank(){
        //Given
        Main sing = new Main();
        //When
        double expected = sing.singToFrank(1.43);
        double actual = 1.01; // doll/1
        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void frankToRing(){
        //Given
        Main sing = new Main();
        //When
        double expected = sing.frankToRing(1.01);
        double actual = 4.47; // doll/1
        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void ringToYen(){
        //Given
        Main ring = new Main();
        //When  
        double expected = ring.ringToYen(4.47);
        double actual = 115.84;

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void yenToYuan(){
        //Given
        Main yen = new Main();
        //When
        double expected = yen.yenToYuan(115.84);
        double actual = 6.92;
        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

}