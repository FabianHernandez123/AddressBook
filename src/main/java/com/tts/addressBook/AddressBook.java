package com.tts.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AddressBook {
    private List<Entry> bookList = new ArrayList<Entry>();

    public AddressBook(){};

    public void addEntry(Entry entry) {
        this.bookList.add(entry);
    }

    public void removeEntry() {

    }

    public void searchEntry(String searchType, String searchString) {
        //can strip the string of new line
        //can check the length of the string.
        //can look at the length of that property in our Entry getting
        //substring of our string
        //match up whether the Entry equals the input, ignoring case?
        //do this in an iterative way, making some list
        //print out all the properties of that list..
        //if there is no match print that out too
        ArrayList<Entry> returnList = new ArrayList<Entry>();
        searchString = searchString.trim().toLowerCase();
        int stringLength = searchString.length();
        for(Entry entry: this.bookList) {
            System.out.println("Testing"+entry.getFirstName());
            if(searchType.equalsIgnoreCase("1")){
                String name = entry.getFirstName().toLowerCase();
                if ((name.substring(0,stringLength-1)).equals(searchString)){
                    System.out.println("name: "+name+"searchstring: "+searchString);
                    returnList.add(entry);
                }
            }
            if(searchType.equals("2")){
                String name = entry.getLastName().toLowerCase();
                if ((name.substring(0,stringLength-1)).equals(searchString)){
                    returnList.add(entry);
                }
            }
            if(searchType.equalsIgnoreCase("3")){
                String name = entry.getPhoneNumber().toLowerCase();
                if ((name.substring(0,stringLength-1)).equals(searchString)){
                    returnList.add(entry);
                }
            }
            if(searchType.equalsIgnoreCase("4")){
                String name = entry.getEmail().toLowerCase();
                if ((name.substring(0,stringLength-1)).equals(searchString)){
                    returnList.add(entry);
                }
            }
        }
        System.out.println(returnList.toString());
        if(returnList.size()==0){
            System.out.println("Nothing found in Address Book");
        } else {
            for (Entry entry : returnList) {
                System.out.println("************");
                System.out.println("First Name: " + entry.getFirstName());
                System.out.println("Last Name: " + entry.getLastName());
                System.out.println("Phone Number: " + entry.getPhoneNumber());
                System.out.println("Email: " + entry.getEmail());
                System.out.println("************");
            }
        }


    }

    public void printBook() {
        if(this.bookList.size()==0){
            System.out.println("This Address Book is Empty.");
        }else {
            for (Entry entry : this.bookList) {
                System.out.println("************");
                System.out.println("First Name: " + entry.getFirstName());
                System.out.println("Last Name: " + entry.getLastName());
                System.out.println("Phone Number: " + entry.getPhoneNumber());
                System.out.println("Email: " + entry.getEmail());
                System.out.println("************\n");
            }
        }
    }

    public void deleteBook() {
        this.bookList = new ArrayList<Entry>();
    }


}
