package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {
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
    public void clickTest() {
        WebElement newslink = driver.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[1]"));
        //点击新闻链接
        newslink.click();
        //校验当前页面是不是新闻页面
        String url = driver.getCurrentUrl();
        //  Assert.assertEquals(url,"http://news.baidu.com/");
    }

    @Test
    public void sendkeysTest() {
        driver.get("https://www.baidu.com");
        WebElement keys = driver.findElement(By.id("kw"));
        keys.sendKeys("selenium");
        WebElement baiduButton = driver.findElement(By.id("su"));
        baiduButton.click();
        //WebElement text = driver.findElement(By.xpath("//*[@id=\"kw\"]"));
        String title = driver.getTitle();

    }

    /**
     * 打开百度
     * 获取tagname
     */
    @Test
    public void getTegNameTest() {

    }

    @Test
    public void idSelectTest() {
        driver.get("https://www.baidu.com");
        WebElement element = driver.findElement(By.id("123"));
        //点击元素
        element.click();
        //元素是否被选中
        Boolean b = element.isSelected();
        Assert.assertTrue(b);
    }
    @Test
    public void enAble(){
        //判断元素是否被激活
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
