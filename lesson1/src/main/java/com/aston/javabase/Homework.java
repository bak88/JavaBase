package com.aston.javabase;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Homework {

    public static void main(String[] args){

        turnString("I love Java");
    }
    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {

//        StringBuilder sb = new StringBuilder(string);
//        System.out.println(sb.reverse().toString());

        char[] array = string.toCharArray();
        char[] arrayRevers = new char[array.length];

        for (int i = array.length - 1; i >= 0 ; i--) {
            arrayRevers[i] = array[i];
            System.out.print(arrayRevers[i]);
        }
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        return null;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        return null;
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        return false;
    }
}