package com.meyoung.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowserTest1 {

//    @Test
    public void openFF() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\86138\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
        //WebDriver webDriver = new ChromeDriver();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(1000);
        //driver.close();
        driver.navigate().back();
        driver.quit();
        //driver.get("https://www.zhihu.com/");
    }

}
