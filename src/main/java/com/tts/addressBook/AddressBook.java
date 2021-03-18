package com.tts.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AddressBook {
    private ArrayList<Entry> bookList = new ArrayList<Entry>();

    public AddressBook(){};

    public void addEntry(Entry entry) {
        this.bookList.add(entry);
    }

    public void removeEntry(String email) {
        List<Entry> removeLater = new ArrayList<Entry>();
        for(Entry entryhere: this.bookList){
            if(email.equals(entryhere.getEmail())){
                System.out.println("Deleted the following entry: \n");
                System.out.println("************");
                System.out.println("First Name: " + entryhere.getFirstName());
                System.out.println("Last Name: " + entryhere.getLastName());
                System.out.println("Phone Number: " + entryhere.getPhoneNumber());
                System.out.println("Email: " + entryhere.getEmail());
                System.out.println("************\n");
                removeLater.add(entryhere);
            }
        } this.bookList.removeAll(removeLater);
        if(removeLater.size()==0){
            System.out.println("Entry not found!\n");
        }

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
            if(searchType.equals("1")){
                String name = entry.getFirstName().toLowerCase();
                if ((name.substring(0,stringLength)).equals(searchString)){
                    returnList.add(entry);
                }
            }
            if(searchType.equals("2")){
                String name = entry.getLastName().toLowerCase();
                if ((name.substring(0,stringLength)).equals(searchString)){
                    returnList.add(entry);
                }
            }
            if(searchType.equals("3")){
                String name = entry.getPhoneNumber().toLowerCase();
                if ((name.substring(0,stringLength)).equals(searchString)){
                    returnList.add(entry);
                }
            }
            if(searchType.equals("4")){
                String name = entry.getEmail().toLowerCase();
                if ((name.substring(0,stringLength)).equals(searchString)){
                    returnList.add(entry);
                }
            }
        }

        if(returnList.size()==0){
            System.out.println("No results found! \n");
        } else {
            for (Entry entry : returnList) {
                System.out.println("************");
                System.out.println("First Name: " + entry.getFirstName());
                System.out.println("Last Name: " + entry.getLastName());
                System.out.println("Phone Number: " + entry.getPhoneNumber());
                System.out.println("Email: " + entry.getEmail());
                System.out.println("************\n");
            }
        }


    }

    public void printBook() {
        if(this.bookList.size()==0){
            System.out.println("Address Book is Empty!\n");
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
