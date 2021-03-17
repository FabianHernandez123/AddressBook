package com.tts.addressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook();

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
            System.out.println("First Name: ");
            String firstName = userInput.nextLine();
            System.out.println("Last Name: ");
            String lastName = userInput.nextLine();
            System.out.println("Phone Number: ");
            String phoneNum = userInput.nextLine();
            System.out.println("Email Address: ");
            String email = userInput.nextLine();
            System.out.println("Added new entry! ");
            Entry newEntry = new Entry(firstName, lastName, phoneNum, email);
            book.addEntry(newEntry);
        }
        if(firstResp.equalsIgnoreCase("3")) {
            System.out.println("1) First Name\n");
            System.out.println("2) Last Name\n");
            System.out.println("3) Phone Number\n");
            System.out.println("4) Email Address\n");
            System.out.println("Choose a search type: ");
            String searchType = userInput.nextLine();
            System.out.println("Enter your search: ");
            String searchString = userInput.nextLine();
        }
    }
}
