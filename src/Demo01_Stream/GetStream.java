package Demo01_Stream;

import java.util.*;
import java.util.stream.Stream;

public class GetStream {
    public static void main(String[] args) {
        //集合转换为Stream流

        List<String> list=new ArrayList<>();

        Stream<String> stream1=list.stream();

        Set<String> set=new HashSet<>();
        Stream<String> stream2=set.stream();


        Map<String,String> map=new HashMap<>();

        //获取键
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();
        //获取值
        Collection<String> values = map.values();

        Stream<String> stream4 = values.stream();

        //获取键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        //把数组转化为stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        Integer[] arr={1,2,3,4,5};

        Stream<Integer> stream7=Stream.of(arr);

        String[] arr2={"a","bb","ccc"};

        Stream<String> stream8 = Stream.of(arr2);






    }
}
