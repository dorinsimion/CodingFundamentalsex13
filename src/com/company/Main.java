package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.println(getNumberDigits1(s));
        System.out.println(getNumberDigits2(s));
    }

    private static int getNumberDigits2(String s) {
        String s2= s.replaceAll("[0-9]","");
        return s.length()-s2.length();
    }

    private static int getNumberDigits1(String s) {
        int counter=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) counter++;
        }
        return counter;
    }
}
