package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
//    @Test(groups = "server")
    public void test1(){
        System.out.println("server测试1");
    }
//    @Test(groups = "server")
    public void test2(){
        System.out.println("server测试2");
    }
//    @Test(groups = "client")
    public void test3(){
        System.out.println("client测试2");
    }
//    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端运行之前运行");
    }
//    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务端运行之后运行");
    }
}
