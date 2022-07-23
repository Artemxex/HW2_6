package hw2_6;

import java.util.*;

public class Method {
    public static void method1(List<Integer> list){
        for (int i:list) {
            if(i%2==0){
                continue;
            }else{
                System.out.print(i+" ");
            }

        }
    }
    public static void method2(List<Integer> list){
        Set<Integer> nums = new HashSet<>();

        for(int i : list){
            nums.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for(int i : nums){
            if(i%2==0){
            list2.add(i);}

        }
        Collections.sort(list2);
        System.out.print(list2);
    }

    public static void method3(List<String> list){
        Set<String> set =new HashSet<>(list) ;
        System.out.println(set);

    }
    public static void method4(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for(String s:list){
            if(map.containsKey(s)){
                map.put(s,(map.get(s))+1);
            }else{
                map.put(s,1);
            }
        }
        System.out.println(map);
    }


}
