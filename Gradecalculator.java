import java.util.*;

 class GradeCalculator {
    public static void main(String[] args){
    
     double p,result;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the gpa in phy:");
      p=sc.nextDouble();
      result=p * 25;
      System.out.println("The result is :"+result);
    }
    
}
