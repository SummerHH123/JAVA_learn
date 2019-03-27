package Demo03_ObjectMethodReference;

public class Test {

    public static void printString(printable p){
        p.print("hello");
    }

    public static void main(String[] args) {

        printString((s)->{
            MethodRerObject obj=new MethodRerObject();

            obj.printUpperCaseString(s);
        });

        //对象存在 成员方法存在

        MethodRerObject obj=new MethodRerObject();

        printString(obj::printUpperCaseString);


    }

}
