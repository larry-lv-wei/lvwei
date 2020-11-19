package com.meyoung.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsTest {
    WebDriver driver;
    @BeforeMethod
    public void openChorme() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\test\\lvwei\\.idea\\dirvers\\chromedriver.exe");
        //WebDriver webDriver = new ChromeDriver();

        driver = new ChromeDriver();

        //driver.close();
        // driver.quit();
        //driver.get("https://www.zhihu.com/");
    }
//打开百度地址
    @Test
    public void byIdTest() {
        driver.get("https://www.baidu.com");
        //Thread.sleep(1000);
        WebElement keyFiled = driver.findElement(By.id("kw"));
        //找到tagname
        List<WebElement> tagName = driver.findElements(By.tagName("input"));
        WebElement xpath =  driver.findElement(By.xpath("//*[@id=\"s_tab\"]/div/a[6]"));

    }

   /* @Test
    public  void xPath(){
        //通过xpath查找元素
      WebElement xpath =  driver.findElement(By.xpath("//*[@id=\"s_tab\"]/div/a[6]"));
    }*/
    @AfterMethod
    public void colsedBrowser(){
        driver. quit();

    }

}
