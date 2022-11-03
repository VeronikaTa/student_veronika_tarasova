package com.epam.training.student_veronika_tarasova.meetstrangers.src.main.java.com.epam.rd.autotasks.meetstrangers;
import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int strangersNumber = scanner.nextInt();

        if(strangersNumber > 0){
            String[] names = new String[strangersNumber];
            int length = names.length;

            for(int i = 0; i < length; i++){
                names[i] = scanner2.nextLine();
            }
            for(String nameInArray : names){
                if(nameInArray != null) {
                    System.out.println("Hello, " + nameInArray);
                }
                else{
                    continue;
                }
            }

            }
        else if(strangersNumber == 0){
            System.out.println("Oh, it looks like there is no one here");
        }
        else{
            System.out.println("Seriously? Why so negative?");
        }
        }
    }

