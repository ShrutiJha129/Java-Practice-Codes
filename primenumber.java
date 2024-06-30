import java.util.*;
class prime{
//     public static void main (String[]  args){
//         int n;
//         Scanner sc = new Scanner ( System.in);
//         System.out.println("Enter a number");
//         n=sc.nextInt();
//         int i;
//         for (i=2;i<=n/2;i++){

//             if (n%i==0){
//                 System.out.print(" not a Prime number");
//                 break;
//             }
            
//             }
        
//         if(i>n/2){
//            System.out.print(" prime number");
           
//         }
        
//         }
// }
public static void prime(int n){
    int i;
    for (i=2;i<=n/2;i++){

        if (n%i==0){
            System.out.print(" not a Prime number");
            break;
            }
            
            }
        
    if(i>n/2){
        System.out.print(" prime number");

    }
    return;
}

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a  number");
        int a=sc.nextInt();
        prime(a);
    }
}
    

        
    
