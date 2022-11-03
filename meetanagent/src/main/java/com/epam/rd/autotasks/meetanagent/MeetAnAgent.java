package com.epam.training.student_veronika_tarasova.meetanagent.src.main.java.com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
  public  final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number == PASSWORD){
            System.out.println("Hello, Agent");
        }
        else{
            System.out.println("Access denied");
        }
    }
}
