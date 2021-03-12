package com.jlang;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String userAnswer = "";
        while(!userAnswer.equals("no")){

            System.out.println("\nInsert your word here: ");
            String userWord = sc.nextLine();
            if(JLangFile.isContained(userWord) == false){
                JLangFile.writeWord(userWord);
                System.out.println("\nWord was successfully written!");
            }
            else {
                System.out.println("\nThis word is already contained in the file!");
            }

            System.out.println("Do you wish to continue? ");
            userAnswer = sc.nextLine();
            userAnswer.toLowerCase();
        }
        sc.close();


    }

    public static void clearScreen(){// I want to implement a method that cleans the screen every time the user answers


    }
}
