package com.tts.addressBook;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Entry> bookList = new ArrayList<>();

    public void addEntry(Entry entry) {
        this.bookList.add(entry);
    }

    public void removeEntry() {

    }

    public Entry searchEntry(String searchType, String searchString) {
        //can strip the string of new line
        //can check the length of the string.
        //can look at the length of that property in our Entry getting
        //substring of our string
        //match up whether the Entry equals the input, ignoring case?
        //do this in an iterative way, making some list
        //print out all the properties of that list..
        //if there is no match print that out too



        return new Entry();
    }

    public void printBook() {

    }

    public void deleteBook() {

    }


}
