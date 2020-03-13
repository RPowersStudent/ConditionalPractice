package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int original=2;
        int input;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("please type a number between 1 and 5" );
        input=keyboard.nextInt();

        if(input>original) {
            System.out.println("too high");
                }
        else if(input<original){
            System.out.println("too low");
        }
        else{
            System.out.println("you guessed right!");
        }



    }
}
