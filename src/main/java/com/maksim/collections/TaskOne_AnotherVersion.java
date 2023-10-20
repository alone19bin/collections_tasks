package com.maksim.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskOne_AnotherVersion {
    public static void main(String[] args) {
        int[] nums = {3, 8, 15, 17};
        System.out.println(Arrays.toString(searchIndex(nums,23)));
    }


    /* TODO:  В Map ключом является значнием, значние является индексом
                 проверяем каждое число в массиве на сумму sum
    *               в if ищем разницу между sum nums[]
                        если разница есть в нашем массиве возвращаем
                            иначе добавляем элекмент в индекс  */
    public static int[] searchIndex(int[] nums, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] indexTwoNumbers = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(sum - nums[i])) {
                indexTwoNumbers[0] = i;
                indexTwoNumbers[1] = map.get(sum - nums[i]);
                return indexTwoNumbers;
            } else {
                map.put(nums[i], i);
            }
        }
    return indexTwoNumbers;
    }
}
