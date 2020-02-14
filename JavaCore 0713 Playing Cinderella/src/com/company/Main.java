package com.company;

import sun.awt.windows.WPrinterJob;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

0713 Playing Cinderella

Play cinderella
1. Enter 20 numbers from the keyboard, save them to the list and sort them into three other lists:
The number is completely divided by 3 (x% 3 == 0), completely divided by 2 (x% 2 == 0) and all the others.
Numbers that are divided by 3 and 2 at the same time, for example 6, fall into both lists.
2. The printList method should display all the elements of the list on a new line.
3. Using the printList method, display these three lists.
First the one for x% 3,
then the one for x% 2,
then the last one.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i=0; i<20;i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }
        for(Integer number : list) {
            if(number % 2 != 0 && number % 3 != 0) {
                list3.add(number);
            } else {
                if (number % 3 == 0) {
                    list1.add(number);
                }
                if(number % 2 == 0) {
                    list2.add(number);
                }
            }
        }
        printList(list1);
    printList(list2);
    printList(list3);
    }
    public static void printList(List<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}









