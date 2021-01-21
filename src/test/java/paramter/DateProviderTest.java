package paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DateProviderTest {
//    @Test(dataProvider="data")
    public void testDateProvider(String name,int age){
        System.out.println("name =" +name +"age ="+age);
    }
//    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][]  result = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",300},
        };
        return result;
    }
}
