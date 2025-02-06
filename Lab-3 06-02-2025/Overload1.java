public class Main {
  public static int sum(int num1, int num2){
    return num1+num2;
  }
  public static int sum(int num1, int num2, int num3){
    return num1+num2+num3;
  }
  public static double sum(double num1, double num2){
    return num1+num2;
  }
  public static String sum(String num1, String num2){
    return num1+num2;
  }
  public static String concat(String num1, String num2){
    return num1+num2;
  }
 public static void main(String[] args) {
  System.out.println(sum(10,5));
  System.out.println(sum(10.55,5.45));
  System.out.println(sum(99,99,2));
  System.out.println(sum(100,51));
  System.out.println(concat("Chutta","Malle"));
 }
}
