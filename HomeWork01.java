package com.google.lesson_01;

import java.util.Random;
import java.util.Scanner;

//ctrl + alt + L
public class HomeWork01 {
    public static void main(String[] args) {
        Random random = new Random();
        int chances = 10;
        Scanner scanner= new Scanner(System.in);
        int randomNumber= random.nextInt(101);
        System.out.println("Hello guess the number from 0 to 100, you have " + chances + " chances");
        while (true){

            int number = Integer.parseInt(scanner.next());
            if(number==randomNumber){
                System.out.println("Congrats, you won!");
                break;
            }
            --chances;
            if(chances==0){
                System.out.println("You lost the game, the number is " + randomNumber );
                break;
            }
            System.out.println(chances + " chances left");

        }
    }
}
