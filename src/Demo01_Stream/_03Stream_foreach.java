package Demo01_Stream;

import java.util.stream.Stream;

public class _03Stream_foreach {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "里斯", "王五", "赵六", "田七");

//        stream.forEach((String name)->{
//            System.out.println(name);
//        });

        //优化

        stream.forEach(name-> System.out.println(name));


    }
}
