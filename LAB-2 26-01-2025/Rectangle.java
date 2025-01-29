import java.util.Scanner;
public class Main{
    double length;
    double width;
    double Area;
    public void insertData(){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Lenght: ");
      length=input.nextDouble();
      System.out.print("Enter Width: ");
      width=input.nextDouble();
    }
    public void display(){
        System.out.println("Area of this Circle "+Area);
    }
    public void area(){
        Area=length*width;
    }

  public static void main(String[] args) {
      Main r1 =new Main();
      r1.insertData();
      r1.area();
      r1.display();
  }
}
