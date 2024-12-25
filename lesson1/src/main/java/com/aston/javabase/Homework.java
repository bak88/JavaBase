package com.aston.javabase;

import java.util.*;

public class Homework {

    public static void main(String[] args){

//         turnString("I love Java");

//        getDistinctNumbers(new int[] {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9});

//        findSecondMaxElement(new int[] {10, 15, 23, 11, 44, 13, 66, 1, 6, 47});

        lengthOfLastWord("    fly me    to the moon    ");

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

        HashSet<Integer> uniqueElement = new HashSet<Integer>() ;

        for (int i = 0; i < ints.length; i++) {
            uniqueElement.add(ints[i]);
        }

        for(var el : uniqueElement) {
            System.out.print(el + " ");
        }

    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {

        int firstMax = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > firstMax)
                firstMax = arr[i];

            if (arr[i] > secondMax)
                if(arr[i] == firstMax)
                    continue;
                else
                    secondMax = arr[i];
        }

        System.out.println(secondMax);
        return secondMax;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {

        String newString = string.trim();

        String[] array = newString.split(" ");

        int lenghtWord = array[array.length-1].length();

        System.out.println(lenghtWord);

        return lenghtWord;
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
