package src.Demo04_Junit.junit.junit;
/*
    测试分类
    1。黑盒测试 不需要写代码，给输入值，看程序能否输出期望的值
    2。白盒测试 需要写代码，关注程序具体执行过程（Junit）

    Junit使用 白盒测试
    步骤
    1。定义一个测试类（测试用例）
        建议：测试类名=被测试类名Test
        包名：xx.xxx.xx.test
    2。定义测试方法：可独立运行
        建议：方法名：test测试的方法名
            返回值 void
            参数类表 空参
    3。给方法加@Test
    4。倒入junit依赖环境

    判定结果
      红色 shibai
      绿色 成功
      一般我们会使用断言操作来处理结果
       Assert.assertEquals(期望的结果,运算的结果)、

    补充：
    @Before：
      修饰的方法会在测试方法之前被执行
    @After：
       修饰的方法会在测试方法执行之后自动执行

 */
public class _01Describe {

    public static void main(String[] args) {
        Calculator c=new Calculator();

        int result=c.add(1,3);
        System.out.println(result);
    }

}
