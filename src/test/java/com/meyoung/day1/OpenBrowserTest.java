package com.meyoung.day1;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;

public class OpenBrowserTest {

//    @Test
    public void openFF() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\test\\lvwei\\.idea\\dirvers\\chromedriver.exe");
        //WebDriver webDriver = new ChromeDriver();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(1000);
        //driver.close();
       // driver.quit();
        //driver.get("https://www.zhihu.com/");
    }

}
