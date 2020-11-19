package com.meyoung.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo2 {


    @Test
    public void asserEqualTest(){

        String a = "sssdd";
        String b = "sssdd";


        Assert.assertEquals(a,b,"a不等于b");


    }
}
