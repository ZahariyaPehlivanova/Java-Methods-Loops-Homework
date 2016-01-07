package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {

            String currentNum = Integer.toString(i);

            String firstNum = currentNum.substring(0, currentNum.length()/2);
            String secondNum = currentNum.substring(currentNum.length()/2+currentNum.length()%2, currentNum.length());

            if (firstNum.equals(secondNum)) {
                System.out.println(currentNum);
            }
        }

    }
}
