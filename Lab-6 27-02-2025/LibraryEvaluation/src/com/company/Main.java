package com.company;

public class Main {
    public static void main(String[] args) {
        //Composition
        String[] bookTitles = {"A Series of Unfortunate Events", "1990", "Home Alone II"};
        Library library = new Library(bookTitles);
        System.out.println("Library Books:");
        library.showBooks();
        System.out.println();

        //Aggregation
        Member member = new Member("Lemone Snicket");
        LibrarySystem system = new LibrarySystem(member);
        system.showMember();
    }
}


