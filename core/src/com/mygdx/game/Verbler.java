package com.mygdx.game;
//Verbler Class
//Aniruddh and Nihar
//8.22.20
//Purpose: To prompt the verbler, take in user input, and cross-check with the correct answer

import java.util.Random;
import java.util.Scanner;

public class Verbler{
    static String[] verblerWords = {"Insert Verbler", "Insert Verbler", "Insert Verbler", "Insert Verbler"};
    static String[] hints = {"Insert Hint", "Insert Hint", "Insert Hint", "Insert Hint"};
    public static int Score = 0;

    public Verbler(){

    }

    public void performLogic(){

        //for(int i = 0; i < )
        Random random = new Random();
        int index = random.nextInt(verblerWords.length);
        System.out.println(verblerWords[index]);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput= sc.nextLine();
        System.out.print("You have entered: "+userInput);

        userInput = userInput.replaceAll("\\s+", "").toLowerCase();
        userInput = userInput.toLowerCase();

        verblerHintPackage();


        String answer = "Answer";


    }


    public static boolean checkVerbler(String verbler, String userEnteredWord){
        return verbler.equals(userEnteredWord);
    }

    public static void verblerHintPackage(){

        if(checkVerbler(answer.toLowerCase(), userInput)) {
            System.out.println("Congrats you have answered correctly!");
            Random randomHint = new Random();
            int x = 0;
            int indexHint = randomHint.nextInt(hints.length);
            System.out.println(hints[indexHint]);
        }
        else {
            System.out.println("OH NO! Try again!");
        }

    }
}