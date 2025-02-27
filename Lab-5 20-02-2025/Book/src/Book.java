public class Book {
    String title;
    int price;
    Author author1;
    Book(){
    }
    Book(String t,int p,Author a){
        this.title=t;
        this.price=p;
        this.author1=a;
    }
    void display(){
        System.out.println(this.title+" "+this.price);
    }
    void displayBooklist(){
        System.out.println("............");
    }
}
