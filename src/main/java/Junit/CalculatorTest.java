package Junit;

public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象
        Calculator c = new Calculator();
        //调用
        int result = c.add(1,2);
        //打印
        System.out.println(result);
    }
}
