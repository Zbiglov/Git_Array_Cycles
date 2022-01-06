package com.zbiglov.study;

import java.util.Random;
import java.util.Scanner;

public class ArrayWithCycles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0;
        int count = 0;
        String regex = "\\d+";

        do {
            System.out.print("Введите количество элементов будущего массива :");
            String s = scan.next();
            if(s.matches(regex)) {
                size = Integer.parseInt(s);
            } else {
                System.out.println("*** Не коректный ввод, используйте только числовые символы!!! ***\n");
            }
        }while (size == 0);

        char[] array = getChars(size);// заполняем массив случайными символами

        while (true) {
            System.out.println("Каким из циклов вывести массив на экран?\n\n" +
                    "1 - for.\n" +
                    "2 - foreach\n" +
                    "3 - while\n" +
                    "4 - do - while\n" +
                    "5 - хватит устал ;-(\n");
            switch (scan.nextInt()) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println("\n*** Цикл for закончил работу! ***\n");
                    break;

                case 2:
                    for(char x : array) {
                        System.out.print(x + " ");
                    }
                    System.out.println("\n*** Цикл foreach закончил работу! ***\n");
                    break;
                case 3:
                    while (count != array.length) {
                        System.out.print(array[count] + " ");
                        count++;
                    }
                    System.out.println("\n*** Цикл while закончил работу! ***\n");
                    count = 0;
                    break;
                case 4:
                    do{
                        System.out.print(array[count] + " ");
                        count++;
                    }while (count != array.length);
                    System.out.println("\n*** Цикл do - while закончил работу! ***\n");
                    count = 0;
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Введеные данные - не верны, попробуйте вновь!\n");

            }
        }

    }

    private static char[] getChars(int size) {
        char[] array = new char[size];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = (char) (random.nextInt(95) + 33);

        }
        return array;
    }
}
