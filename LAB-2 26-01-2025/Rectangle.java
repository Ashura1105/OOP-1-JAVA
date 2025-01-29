import java.util.Scanner;
class Main {
    int length;
    int height;
    int area;
    void Area(){
        area= height*length;
    }
    public void display(){
        System.out.println("Area= " + area);
    }
    void insertData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length=input.nextInt();
        System.out.print("Enter Height: ");
        height=input.nextInt();
    }
    public static void main(String[] args) {
        Main e= new Main();
        e.insertData();
        e.Area();
        e.display();
    }
}
