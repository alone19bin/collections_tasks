package com.maksim.collections;

import java.util.*;
import java.util.stream.IntStream;

public class TaskOne {
    public static void main(String[] args) {
        int[] nums = {3, 8, 15, 17};
        int sum = 11; //
        search(nums, sum);
    }
/*TODO  -В первом цикле проходиммя по кажому элементу кроме посленего
*         -Во втором с i до последнего элемента
*           -Если сумма найдена, выводим ее   */
    public static void search(int[] nums, int sum) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum) {
                    System.out.println("Индексы: " + i + " и " + j);
                }
            }
        }
    }
}
