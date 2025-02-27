public class Main {
    public static void main(String[] args) {
        Author a1=new Author("Samsunnahar");
    Book b1= new Book("Habijabi",200,a1);
    b1.display();
    b1.displayBooklist();
    a1.writeBook();
    }
}