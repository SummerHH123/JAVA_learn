package Demo01_Stream;

import java.util.stream.Stream;

public class _04Stream_filter {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三疯", "张翠山", "赵敏", "周芷若", "张无忌");

        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        stream1.forEach(name-> System.out.println(name));

        /*
                    stream流属于管道流，只能被消费（使用）一次

         */
        stream1.forEach(name-> System.out.println(name));




    }
}
