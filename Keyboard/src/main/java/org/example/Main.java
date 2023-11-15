package org.example;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//
//        Keyboard keyboard = new Keyboard();
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Enter english character: ");
//
//            char ch = scanner.nextLine().toLowerCase().charAt(0);
//
//            if (keyboard.getEnglish().indexOf(ch) == -1) {
//                break;
//            }
//
//            System.out.println(keyboard.getLeftEnglishChar(ch));
//        }
//
//    }
    public static void main(String[] args) {
        Arrows arrows = new Arrows();
        String test = "<--<<<--<<>>--><--<<<--<<>>--><--<<<--<<>>--><--<<<--<<>>-->";
        long start = System.nanoTime();
        System.out.println(arrows.countArrows(test));
        System.out.println(System.nanoTime() - start);

        start = System.nanoTime();
        System.out.println(arrows.countArrowsPossiblyAdvanced(test));
        //System.out.println(System.nanoTime() - start);
    }
}