package com.epam.training.student_veronika_tarasova.snail.src.main.java.com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int days = 0;

        if(b >= a && h > a){
            System.out.println("Impossible");
        }
        else if(h < a){
            days = 1;
            System.out.println(days);
        }
        else{
            boolean reachedTop = false;
            while(!reachedTop){
                h -= a;
                days ++;
                if(h == 0){
                    reachedTop = true;
                }
                h += b;
            }
            System.out.println(days);
        }
    }
}
