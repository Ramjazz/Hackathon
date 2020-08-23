package com.mygdx.game;

import java.util.Scanner;

public class VerblerFixed{

    static String[] verblerWords = {"Che(tongue)ek remark", "Pol4icy", "Acti[on]", "Mind \n Matter", "Sil ||| ence",
            "[Secret]\nSecret\nSecret",
            "give give give give\n" +
            " get get get get",
            "O_ER_T_O_ ",
            "  h\n" +
                    "          e\n" +
                    "          a\n" +
                    "grape r vine\n" +
                    "          d\n" +
                    "           i\n" +
                    "           t\n"};
    public static int score = 0;
    public static String userInput = "";
    public static String[] answer = {"Tongue in cheek remark","Foreign policy","Mind over matter","Broken Silence", "Top secret",
            "Forgive and Forget",
            "Painless operation",
            "Heard it across the grapevine"};
    public static boolean rightOrWrong;
    public static boolean gaveUp = false;
    public static void main(String[] args){

        for(int i = 0; i < 4; i++) {

            System.out.println(verblerWords[i]);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a guess (or \"give up\"): ");
            userInput = sc.nextLine();
            System.out.print("You have entered: " + userInput);
            if (userInput.equals("give up")){
                gaveUp = true;
                break;
            }

            userInput = userInput.replaceAll("\\s+", "").toLowerCase();
            userInput = userInput.toLowerCase();

            rightOrWrong = verblerHintPackage(i);
            if (rightOrWrong == false){
                i = i - 1;
            }
        }
        if(gaveUp){
            System.out.println("\nOOPS, YOU GAVE UP, YOUR SCORE WAS "+ score);
        }
        else {
            System.out.println("CONGRATS YOU'VE WON");
        }
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