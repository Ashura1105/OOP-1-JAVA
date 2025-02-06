import java.util.Scanner;
 
public class Main {
  double height;
  double width;
  double radius;
 
  public Main(double height,double width,double radius){
      this.height = height;
    this.width =  width;
    this.radius= radius;
  }
 
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
    Scanner input = new Scanner(System.in);
 
    System.out.print("Height: ");
    double height = input.nextDouble();
 
    System.out.print("Width: ");
    double width = input.nextDouble();
 
    System.out.print("Radius: ");
    double radius = input.nextDouble();
   
    Main myObj = new Main(height,width,radius);
   
    myObj.display();
  }
}
