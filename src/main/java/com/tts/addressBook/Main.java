package com.tts.addressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1) Add an entry\n");
        System.out.println("2) Remove an entry\n");
        System.out.println("3) Search for a specific entry\n");
        System.out.println("4) Print Address Book\n");
        System.out.println("5) Delete Book\n");
        System.out.println("6) Quit\n\n");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please choose what you'd like to do with the database: ");
        String firstResp = userInput.nextLine();
        if(firstResp.equalsIgnoreCase("1")) {
            Entry newEntry = new Entry();
            System.out.println("First Name: \n");
            System.out.println("Last Name: \n");
            System.out.println("Phone Number: \n");
            System.out.println("Email Address: \n");
            System.out.println("Added new entry! \n");
        }
    }
}
