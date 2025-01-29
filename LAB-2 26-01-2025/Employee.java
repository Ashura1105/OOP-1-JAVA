import java.util.Scanner;
class Main {
    String name;
    int age;
    int salary;
    int id;
    static void displaydash(){
        System.out.println("----------------------------");
    }
    public void display(){
        System.out.println("Name: " +name);
         System.out.println("ID: " +id);
         System.out.println("Yearly income: " +(salary*12)+"Taka");
         System.out.println("Lifetime: " +(salary*12*(65-age))+"Taka");
    }
    void insertData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name=input.nextLine();
        System.out.print("Enter Age: ");
        age=input.nextInt();
        System.out.print("Enter Salary: ");
        salary=input.nextInt();
        System.out.print("Enter Id: ");
        id=input.nextInt();
    }
    public static void main(String[] args) {
        Main e1= new Main();
        e1.insertData();
        displaydash();
        e1.display();
    }
}
