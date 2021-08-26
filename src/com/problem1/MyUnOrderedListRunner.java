package com.problem1;

import java.util.Locale;
import java.util.Scanner;

public class MyUnOrderedListRunner {
    public static void main(String[] args) {
        MyUnOrderedList myUnOrderedList = new MyUnOrderedList<>();

        String sentence = "Hello can you smile";
        String [] word = sentence.toLowerCase().split(" ");
        for(String w : word)
            myUnOrderedList.add(w);
        myUnOrderedList.showList();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word you want to add or delete :- ");
        String userWord = sc.next();

        myUnOrderedList.checkIfPresentOrAbsent(userWord.toLowerCase());
        myUnOrderedList.showList();

    }
}
