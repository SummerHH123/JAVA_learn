package src.Demo01_Stream;

import java.util.stream.Stream;

public class _05Stream_map {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");

        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });

        stream2.forEach(name-> System.out.println(name));


    }


}
