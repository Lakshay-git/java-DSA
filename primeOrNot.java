// import java.util.*;

// public class primeOrNot {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         boolean isPrime = true;
//         if(n == 2){
//             System.out.println("n is prime no.");
//         }else{
//             for(int i =2; i<=n-1; i++){
//                 if(n%i ==0 ){  // n is multiple of i (i not equal to 1 or n)
//                     isPrime = false;
//                 }
//             }
    
//             if(isPrime == true){
//                 System.out.println("n is prime no ");
//             }
//             else{
//                 System.out.println("n is not prime no. ");
//             }
//         }

        
//     }
// }

// is code mai apn ne orr optimize kra root n lga ke taaki bade no. ka answer jaldi mile 
import java.util.*;

public class primeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n == 2){
            System.out.println("n is prime no.");
        }else{
            for(int i =2; i<=Math.sqrt(n); i++){
                if(n%i ==0 ){  // n is multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }
    
            if(isPrime == true){
                System.out.println("n is prime no ");
            }
            else{
                System.out.println("n is not prime no. ");
            }
        }

        
    }
}
