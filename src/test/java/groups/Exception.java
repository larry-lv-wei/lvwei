package groups;

import org.testng.annotations.Test;

public class Exception {

    /**
     * 期望结果是异常
     * 某些不合法的参数，程序抛出异常
     */

    //结果失败的异常
//    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaied(){
        System.out.println("超时失败");
    }
//    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("超时失败");
        throw new RuntimeException();
    }
}
