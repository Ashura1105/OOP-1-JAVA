public class Main {
public static void multigun(int amp) {
int multy=0;
    for (int i = 1; i <=10 ; i++) {
    multy=amp*i;
    System.out.println(amp+"*"+i+"="+multy);
    }
}
  public static void main(String[] args) {
  //add,mult,sub of 2 numbers
  int a=5;
  float b=3.99f;
  float add=a+b;
  float mult=a*b;
  float sub=a-b;
    System.out.println("Addition "+add);
    System.out.println("Multiplication "+ mult);
    System.out.println("Subtraction "+ sub);
 
    //sum and avg of array element
    int[] arr={10,15,20,25,30,7};
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
    sum=sum+arr[i];
    }
    float avg=sum/arr.length;
    System.out.println("Array Addition "+ sum);
    System.out.println("Average "+ avg);
 
    //even and even sum
    int sum1=0;
    for (int i = 0; i < arr.length; i++) {
    if(arr[i]%2==0){
    System.out.print(arr[i]+" ");
    sum1=sum1+arr[i];
    }
    }
    System.out.println("Sum="+sum1);
 
    //odd and odd sum
    int sum2=0;
    for (int i = 0; i < arr.length; i++) {
    if(arr[i]%2!=0){
    System.out.print(arr[i]+" ");
    sum2=sum2+arr[i];
    }
    }
    System.out.println("Sum="+sum2);
 
    //multiplication table of any number
    int amp=12;
    multigun(amp);
 
    //Prime number
    int i,m=0,flag=0;      
  int n=7;    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" not prime");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" prime");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0){
   System.out.println(n+" prime"); 
   }  
  } 
  }
}
