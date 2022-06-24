package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer [] nums = {1, 4, 9, 2, 8, 7};

        Integer maxValue = Arrays.stream(nums).filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compareTo).get();
        System.out.println(maxValue);



    }
}



















