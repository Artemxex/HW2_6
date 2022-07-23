package hw2_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7,9,2,3,5,2,6,2,3,1,2,5));
        List<String> text = new ArrayList<>(List.of("Pog","aRolf","MonkaS","pepega","pepe","BlessRNG","pepe","MonkaS","pepe","pepega","catJam"));
        Method.method1(nums);
        System.out.println();
        Method.method2(nums);
        System.out.println();
        Method.method3(text);
        System.out.println();
        Method.method4(text);


    }

}