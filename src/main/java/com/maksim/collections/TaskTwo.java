package com.maksim.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class TaskTwo {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 6, 8};
        boolean res = Arrays.stream(nums)   //Стрим из массива
                .boxed() //преобращование автобоксинг в integer для листа
                .distinct()   //.возвращает новый поток, содержащий только уникальные элементы исходного потока
                .toList()   //Этот метод возвращает коллектор, который накапливает входные элементы в новый List
                .size() != nums.length; //возвращает размер списка, он не равен
        System.out.println( res);
    }///Просто сравните длину исходного массива с длиной четко отфильтрованного списка.
}




