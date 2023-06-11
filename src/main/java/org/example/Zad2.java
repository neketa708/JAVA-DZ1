package org.example;

import java.util.Scanner;

/*2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
        Пример ввода:
        1 2 1 2 -1 1 3 1 3 -1 0
        Логика расчета:
        2 -1 переход -> 2 в сумму
        3 -1 переход -> 3 в сумму
        Пример вывода: 5*/
public class Zad2 {
    public static void main(String [] d) {
        int count = 0;
        int sum = 0;
        int [] nums = { 1, 2,1,2,-1,1,3,1,3,-1,0,7,-1};
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i]>0){
                count = nums[i];
            } else if (nums[i] < 0) {
                sum += count;
            } else if (nums[i] == 0) {
                break;
            }
        };
        System.out.println(sum);
    }
}
