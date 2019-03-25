import com.sun.source.tree.IfTree;

import java.util.Scanner;

//public class Main {
    //Задание 1
    //public static void main(String [] args) {
      //  Scanner sc = new Scanner(System.in);
       // int a, n = (int)(Math.random()*10);
        //System.out.println("Угадай число от 0 до 9, у тебя 3 попытки!!!");
       // for (int i = 0; i < 3; i++) {
         //   System.out.println("Попытка " + (i + 1));
         //   a = sc.nextInt();
           // if (a < n) System.out.println("Число больше");
            //if (a > n) System.out.println("Число меньше");
            //if (a == n) System.out.println("Вы угадали!!!");
            //else {
             //   System.out.println("Попытка " + (i + 2) + ":");
           // }
            //a = sc.nextInt();
           // if (a < n) System.out.println("Число больше");
            //if (a > n) System.out.println("Число меньше");
            //if (a == n) System.out.println("Вы угадали!!!");
            //else {
            //    System.out.println("Попытка " + (i + 3) + ":");
           // }
           // a = sc.nextInt();
           // if (a < n) System.out.println("Число больше");
           // if (a > n) System.out.println("Число меньше");
           // if (a == n) System.out.println("Вы угадали!!!");
           // else {
           //     if (a != n) System.out.println("Вы не угадали");
           // }
           //     System.out.println("Повторить игру еще раз, 1 - да / 0 - нет");
           //     a = sc.nextInt();


             //   }
       // }

        //}
        // Задание 2

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int n = (int) Math.floor(Math.random() * words.length);
        System.out.println(words[n]);
        System.out.println("Программа загадала слово, попробуйте угадать");
        System.out.println("Введите слово: ");
            word = sc.nextLine();
            if (word.equals(words[n])) {
                System.out.println("Вы угадали");
            } else {
                System.out.println("Вы не угадали");
            }


        }

    }


