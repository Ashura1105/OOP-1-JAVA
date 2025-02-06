import java.util.Scanner;
 
public class Main {
  double height;
  double width;
  double radius;
 
  public double area(double height, double width){
    this.height = height;
    this.width =  width;
    return this.height * this.width;
  }
  public double area(double radius){
    this.radius= radius;
    return 3.1416 * this.radius * this.radius;
  }
 
  public void display(){
    System.out.println("Area Rectangle: " + area(height, width));
    System.out.println("Area Circle: " + area(radius));
  }
 
  public static void main(String[] args) {
    Main myObj = new Main();
    Scanner input = new Scanner(System.in);
 
    System.out.print("Height: ");
    myObj.height = input.nextDouble();
 
    System.out.print("Width: ");
    myObj.width = input.nextDouble();
 
    System.out.print("Radius: ");
    myObj.radius = input.nextDouble();
   
    myObj.display();
  }
}
