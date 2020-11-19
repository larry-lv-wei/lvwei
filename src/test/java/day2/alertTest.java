package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class alertTest {
    WebDriver driver;

    @BeforeMethod
    public void openChorme() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\test\\lvwei\\.idea\\dirvers\\chromedriver.exe");
        //WebDriver webDriver = new ChromeDriver();

        driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(1000);
    }

    @Test
    public void alertTest() {
        //alert弹出框
        driver.get("https://www.baidu.com");
        driver.findElement(By.id("2323")).click();
        //switchTo()转交给alert
        Alert alert = driver.switchTo().alert();
        //点击alert 确认
        alert.accept();

    }


    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


}
