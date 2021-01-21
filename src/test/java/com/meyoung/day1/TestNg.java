package com.meyoung.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {

//    @BeforeTest
    public void beforeTestCase1(){
        System.out.println("这就是@testng");
    }

//    @Test
    public void testCase1() {
        System.out.println("这就是@testng");
    }

    @Test
    public void testCase2() {
        System.out.println("这就是@testng2");
    }

}
