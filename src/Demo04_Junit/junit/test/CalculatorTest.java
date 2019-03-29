package src.Demo04_Junit.junit.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.Demo04_Junit.junit.junit.Calculator;

public class CalculatorTest {
    /**
     * 初始化方法
     * 用于资源申请 所有测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init(){
        System.out.println("init...");

    }

    /**
     * 释放资源的方法
     * 在所有测试方法执行完之后 都会自动执行
     */
    @After
    public void close(){
        System.out.println("Close...");
    }


    @Test

    public void testAdd(){
        //System.out.println("我被执行");
        Calculator c=new Calculator();

        int result=c.add(1,2);

        System.out.println("testAdd...");
        //System.out.println(result);
        Assert.assertEquals(3,result);

    }
}
