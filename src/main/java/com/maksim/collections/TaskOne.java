package com.maksim.collections;

import java.util.*;
import java.util.stream.IntStream;

public class TaskOne {
    public static void main(String[] args) {
        int[] nums = {3, 8, 15, 17};
        int target = 11; //
        findPair(nums, target);
    }

    public static void findPair(int[] nums, int sum) {
        // рассмотреть каждый элемент, кроме последнего элемента
        for (int i = 0; i < nums.length - 1; i++) {
            // начать с i-го элемента до последнего элемента
            for (int j = i + 1; j < nums.length; j++) {
                //если искомая сумма найдена, выведите ее и верните
                if (nums[i] + nums[j] == sum) {
                    System.out.println("Индексы: " + i + " и " + j);
                    return;
                }
            }
        }
    }
}