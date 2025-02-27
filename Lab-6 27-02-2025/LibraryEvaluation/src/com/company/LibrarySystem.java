package com.company;

class LibrarySystem {
    private Member member; // Aggregation: LibrarySystem can have a member

    LibrarySystem(Member member) {
        this.member = member;
    }

    void showMember() {
        System.out.println("Library Member: " + member.name);
    }
}