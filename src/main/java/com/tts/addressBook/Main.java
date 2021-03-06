package com.tts.addressBook;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        boolean continueVar = true;
        do {
            System.out.println("1) Add an entry\n");
            System.out.println("2) Remove an entry\n");
            System.out.println("3) Search for a specific entry\n");
            System.out.println("4) Print Address Book\n");
            System.out.println("5) Delete Book\n");
            System.out.println("6) Quit\n");

            Scanner userInput = new Scanner(System.in);
            System.out.println("Please choose what you'd like to do with the database: ");
            String firstResp = userInput.nextLine();
            if (firstResp.equalsIgnoreCase("1")) {
                System.out.println("First Name: ");
                String firstName = userInput.nextLine();
                System.out.println("Last Name: ");
                String lastName = userInput.nextLine();
                System.out.println("Phone Number: ");
                String phoneNum = userInput.nextLine();
                System.out.println("Email Address: ");
                String email = userInput.nextLine();
                System.out.println("Added new entry! \n");
                Entry newEntry = new Entry(firstName, lastName, phoneNum, email);
                book.addEntry(newEntry);
            }
            if(firstResp.equalsIgnoreCase("2")){
                System.out.println("Enter an entry's email to remove: ");
                String emailRemove = userInput.nextLine();
                book.removeEntry(emailRemove);
            }
            if (firstResp.equalsIgnoreCase("3")) {
                System.out.println("1) First Name\n");
                System.out.println("2) Last Name\n");
                System.out.println("3) Phone Number\n");
                System.out.println("4) Email Address\n");
                System.out.println("Choose a search type: ");
                String searchType = userInput.nextLine();
                    String[] optionList = {"1", "2", "3", "4"};
                    if(Arrays.asList(optionList).contains(searchType)) {
                        System.out.println("Enter your search: ");
                        String searchString = userInput.nextLine();
                        book.searchEntry(searchType, searchString);
                    } else {
                        System.out.println("Invalid Search option.\n");
                    }
            }
            if(firstResp.equalsIgnoreCase("4")){
                book.printBook();
            }
            if(firstResp.equalsIgnoreCase("5")){
                book.deleteBook();
            }
            if(firstResp.equalsIgnoreCase("6")) {
                continueVar = false;
            }
        } while(continueVar);
    }
}
