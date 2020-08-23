package com.mygdx.game;
//Verbler Class
//Aniruddh and Nihar
//8.22.20
//Purpose: To prompt the verbler, take in user input, and cross-check with the correct answer

import java.util.Random;
import java.util.Scanner;

public class Verbler{
    static String[] verblerWords = {"A", "B", "C", "D"};
    public static int Score = 0;
    public static String userInput = "";
    public static String[] answer = {"Insert Verbler","Insert Verbler","Insert Verbler","Insert Verbler"};

    public Verbler(){

    }

    public static void main(String[] args){

        for(int i = 0; i < 4; i ++) {

            Random random = new Random();
            int index = random.nextInt(verblerWords.length);
            int index2 = i;
            System.out.println(verblerWords[index]);


            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a guess: ");
            userInput = sc.nextLine();
            System.out.print("You have entered: " + userInput);

            userInput = userInput.replaceAll("\\s+", "").toLowerCase();
            userInput = userInput.toLowerCase();

            verblerHintPackage(index2);
        }
    }


    public static boolean checkVerbler(String verbler, String userEnteredWord){
        return verbler.equals(userEnteredWord);
    }

    public static void verblerHintPackage(int index2){

        if(checkVerbler(answer[index2].toLowerCase().replaceAll("\\s", ""), userInput)) {
            System.out.println("\n" + "Congrats you have answered correctly!"+"\n");
        }
        else {
            System.out.println("\n" + "OH NO! Try again!"+"\n");
        }

    }
}