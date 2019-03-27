package Demo02_MethodReference;

public class DemoPrintable {

    public static void printString(printable p){
        p.print("HelloWord");
    }

    public static void main(String[] args) {
        printString(s->{
            System.out.println(s);
        });



        //方法引用

        printString(System.out::println);
    }
}
