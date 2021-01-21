package suite;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
//    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuite 运行");
    }
//    @AfterSuite
    public void afterSuite(){
        System.out.println("aftersuite 运行");
    }
}
