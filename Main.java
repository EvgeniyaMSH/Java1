package com.company.lesson2;

public class lesson2 {

     // Задача 1
     // Задать целочисленный массив, состоящий из элементов 0 и 1.
     // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static int[] zamena (int[] a) {
        int arrayLength = a.length;

        for (int i = 0; i < arrayLength; i++) {
            a[i] = (a[i] > 0) ? 0 : 1;
        }
        return a;
    }

     // Задача 2
     // Задать пустой целочисленный массив размером 8.
     // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static int[] zapolnenie(int[] a) {
        int length = a.length;

        for (int i = 0; i < length; i++) {
            a[i] = i * 3;
        }
        return a;
    }

     // Задача 3
     // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static int[] umnozit(int[] a) {
        int length = a.length;
        int tmp;

        for (int i = 0; i < length; i++) {
            tmp = a[i];
            a[i] = tmp < 6 ? tmp * 2 : tmp;
        }
        return a;
    }


     // Задача 4
     // Создать квадратный двумерный целочисленный массив (количество строк и столбцов
     //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static int[][] Diagonal(int[][] a) {
        int length = a.length;
        int b;
        int c;
        int d;
        int g;

        for (int i = 0; i < length; i++) {
            b = i;
            c = length - i - 1;

            d = a[i][b];
            g = a[i][c];

            if (d != 1 && g != 1) {
                a[i][b] = 1;
                a[i][c] = 1;
            }
        }
        return a;
    }

     // Задача 5
     // Задать одномерный массив и найти в нем минимальный и максимальный
     // элементы (без помощи интернета);
    static int[] minim(int[] a) {
        int min = 0;
        int max = 0;

        for (int item : a) {
            if (item < min) min = item;
            if (item > max) max = item;
        }
        return new int[]{min, max};
    }

     // Задача 6
     // Написать метод, в который передается не пустой одномерный целочисленный массив,
     // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
     // массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance
     // ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
     // граница показана символами ||, эти символы в массив не входят
    static boolean checkBalance(int[] a) {
        int length = a.length;
        int summa1;
        int summa2;

        for (int i = 0; i < length - 1; i++) {
            summa1 = 0;
            summa2 = 0;

            for (int j = 0; j <= i; j++) {
                summa1 += a[j];
            }

            for (int k = i + 1; k < length; k++) {
                summa2 += a[k];
            }

            if (summa1 == summa2) return true;
        }
        return false;
    }
     // Задача 7
     // Написать метод, которому на вход подается одномерный массив и число n (может быть
     // положительным, или отрицательным), при этом метод должен сместить все элементы
     // массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными
     // массивами.
    static int[] massivi(int[] a, int n) {
