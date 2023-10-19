package com.maksim.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class TaskTwo {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 6, 8};
        boolean res = Arrays.stream(nums)  
                .boxed() 
                .distinct()   
                .toList()  
                .size() != nums.length; 
        System.out.println( res);
    }
}




