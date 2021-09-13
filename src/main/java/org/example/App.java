package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("How many people? ");
        Scanner sc = new Scanner(System.in);
        int people_number = Integer.parseInt(sc.nextLine());
        System.out.println("How many pizzas do you have? ");
        int pizzas = Integer.parseInt(sc.nextLine());
        System.out.println("How many slices per pizza? ");
        int slices_per_pizza = Integer.parseInt(sc.nextLine());
        int total_slices = pizzas * slices_per_pizza;
        System.out.println(people_number + " people with "+ pizzas+ " pizzas ("+ total_slices+ " slices)");
        int pizzas_per_person = (total_slices / people_number);
        System.out.println("Each person gets "+pizzas_per_person+ " pieces of pizza.");
        int leftovers = total_slices - (pizzas_per_person * people_number);
        System.out.println("There are "+ leftovers+ " leftover pieces.");



    }
}
