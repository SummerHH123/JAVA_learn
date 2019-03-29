package src.Demo01_Stream;

import java.util.stream.Stream;

public class _07Stream_limit {

    public static void main(String[] args) {
        String[] arr={"喜羊羊","美羊羊","灰太狼","懒羊羊"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream2 = stream.limit(2);

        stream2.forEach(name-> System.out.println(name));

    }


}
