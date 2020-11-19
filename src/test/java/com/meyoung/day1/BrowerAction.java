package com.meyoung.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BrowerAction {
    @Test
    public void openFF() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\test\\lvwei\\.idea\\dirvers\\chromedriver.exe");
        //WebDriver webDriver = new ChromeDriver();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(1000);
        //driver.close();
        driver.navigate().back();
        Thread.sleep(1000);
        Dimension dimension = new Dimension(300,300);
         driver.quit();
        //driver.get("https://www.zhihu.com/");
    }

}

