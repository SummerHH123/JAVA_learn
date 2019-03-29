package src.Demo01_Stream;

import java.util.ArrayList;
import java.util.List;

public class Stream01 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("张无忌");
        list.add("周芷若");
        list.add("赵盾");
        list.add("张强");
        list.add("张三丰");

        //传统for循环
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------");

        List<String> list1=new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                list1.add(s);
            }

        }

        List<String> list2=new ArrayList<>();
        for (String s : list1) {
            if (s.length()==3){
                list2.add(s);
            }
        }

        for (String s : list2) {
            System.out.println(s);

            
        }
        System.out.println("----------");


        //过滤数据,xuan
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }


}
