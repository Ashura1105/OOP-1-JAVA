public class Main {
 
    String title;
    String author;
    int price;
 
    public Main() {
        this.title = "Not Found";
        this.author = "NULL";
        this.price = 0;
    }
    public Main(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;  
    }
    public Main(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
 
    public static void main(String[] args) {
 
        Main book1 = new Main();
        System.out.println("Book 1: ");
        book1.display();
        System.out.println();
 
        Main book2 = new Main("Bangladesh Jindabad", "BNP");
        System.out.println("Book 2-Title and Author: ");
        book2.display();
        System.out.println();
 
        Main book3 = new Main("Joy Bangla", "Bangladesh AL", 25);
        System.out.println("Book 2-Title, Author, and Price: ");
        book3.display();
    }
}
