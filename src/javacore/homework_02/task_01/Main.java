package javacore.homework_02.task_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListCopy = new ArrayList<>();

        for (int number : intList) {
            if (number > 0 && (number % 2 == 0)) {
                intListCopy.add(number);
            }
        }
        Collections.sort(intListCopy);
        for (int number : intListCopy) { // Сделал вывод в консоль через цикл for, чтобы вывод был идентичен выводу со стрима.
            System.out.println(number);  // Можно также сделать вывод просто через System.out.println(intListCopy)
        }
    }
}
