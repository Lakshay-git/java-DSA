// public class whileLoop {
//     public static void main(String args[]){
//         int counter = 0;
//         while(counter < 100 ) {
//             System.out.println("hello world");
//             counter++;
            
//         }
//         System.out.println("printer hw 100x ");
//     }
    
// }


//print number from 1 to 10 
// public class whileLoop {

//     public static void main(String args[]){
//         int counter = 1;
//         while(counter <= 10) {
//             System.out.print(counter+" ");
//             counter++;
            
//         }
//         System.out.println();
//     }
// }

//print number 1 to n 

import java.util.Scanner;

// public class whileLoop {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number : ");
//         int n = sc.nextInt();

//         int counter = 1;
//         while(counter <= n){
//             System.out.println(counter);
//             counter++;
//         }
//     }

    
// }

//print sum of first n natural numbers 

public class whileLoop {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;


        while (i<=n) {
            sum = sum + i;
            i++;
            
        }
        System.out.println("sum is : " + sum);

    }
}