package com.mygdx.game;

import java.util.Scanner;

public class VerblerFixed{

    static String[] verblerWords = {"A", "B", "C", "D"};
    public static int score = 0;
    public static String userInput = "";
    public static String[] answer = {"A","B","C","D"};
    public static boolean rightOrWrong;

    public static void main(String[] args){

        for(int i = 0; i < 4; i++) {

            System.out.println(verblerWords[i]);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a guess: ");
            userInput = sc.nextLine();
            System.out.print("You have entered: " + userInput);

            userInput = userInput.replaceAll("\\s+", "").toLowerCase();
            userInput = userInput.toLowerCase();

            rightOrWrong = verblerHintPackage(i);
            if (rightOrWrong == false){
                i = i - 1;
            }
        }
        System.out.println("CONGRATS YOU'VE WON");
    }


    public static boolean checkVerbler(String verbler, String userEnteredWord){
        return verbler.equals(userEnteredWord);
    }

    public static boolean verblerHintPackage(int index2){

        if(checkVerbler(answer[index2].toLowerCase().replaceAll("\\s", ""), userInput)) {
            System.out.println("\n" + "Congrats you have answered correctly!"+"\n");
            score += 10;
            System.out.println(score);
            return true;
        }
        else {
            System.out.println("\n" + "OH NO! Try again!"+"\n");
            score -= 10;
            return false;
        }

    }
}