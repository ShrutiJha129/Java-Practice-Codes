import java.util.*;

 class TempConverter {
    public static void main(String[] args){
      int c;
      double f;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of temperature in celsius:");
      c=sc.nextInt();
      f=c*(9.0/5.0)+32;
      System.out.println("The temperature in fahrenheit is :"+f);

    }
    
}
