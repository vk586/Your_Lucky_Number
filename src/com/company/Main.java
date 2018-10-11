package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sS = new Scanner(System.in);
        Scanner sI = new Scanner(System.in);
        boolean again = false;

        do {
            System.out.println("Please pick a number as a range for your lucky number!");
            int iR = sI.nextInt();

            System.out.println("What is your name?");
            String sN = sS.nextLine();

            luckyNum r = new luckyNum(iR, sN);

            System.out.println("Nice to meet you, " + r.stateName() + "! Your lucky number is " + r.perfectRandom() + ".");

            System.out.println("Do you wish to do this again?");
            String answer = sS.nextLine();
            if (answer.equals("yes")) {
                again = true;
            }
            else {
                again = false;
            }
        } while (again);
    }
}
