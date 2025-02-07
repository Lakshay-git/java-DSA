// // // public class function {

// // //     public static void printHelloWorld(){
// // //         System.out.println("hello world ");
// // //         System.out.println("hello world ");
// // //         System.out.println("hello world ");
// // //     }
// // //     public static void main(String args[]){
// // //         printHelloWorld(); // function call
// // //     }
// // // }

// // import java.util.*;

// // public class function {
// //     public static int calculateSum(int num1 , int num2){ // num1 and num 2 are parameters or formal parameters

// //         int sum = num1  + num2 ;
// //         return sum;

// //     }

// //     public static void swap(int a , int b){
// //         //swap
// //         int temp = a;
// //         a = b  ;
// //         b = temp;
// //         System.out.println("a = " + a);
// //         System.out.println("b = " + b);

// //     }

// //     public static int multiply(int a , int b){
// //         int product = a*b;
// //         return product;
// //     }

// //     public static int factorial(int n){
// //         int f = 1;
// //         for(int i = 1; i<=n; i++){
// //             f = f*i;

// //         }
// //         return f; // factorial of n 

// //     }

// //     public static void main(String args[]){

// //         System.out.println(factorial(4));  // factorial jo apan ne function bnaya uski copy hai orignal value java mai ni aati 
// //     }
// // }

public class function {

//     public static int factorial(int n) {
//         int f = 1;
//         for (int i = 1; i <= n; i++) {
//             f = f * i;

//         }
//         return f; // factorial of n
//     }

//     public static int bincoeff(int n, int r) {
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n - r);

//         int bincoeff = fact_n / (fact_r * fact_nmr);
//         return bincoeff;

//     }

//     // fun to calculate 2 no.
//     // public static int sum(int a , int b ){
//     // return a + b;
//     // }
//     // func to calcu 3 no.
//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     // fun to calc int sum
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     // fun to calc float sum
//     public static float sum(float a, float b) {
//         return a + b;
//     }

//     // //only for n>=2
//     // public static boolean isPrime(int n){
//     // //corner case
//     // //2
//     // if(n == 2){
//     // return true;
//     // }

//     // boolean isPrime = true;
//     // for(int i = 2; i<=n-1; i++){
//     // if(n % i == 0){
//     // isPrime = false; //completely dividing
//     // }
//     // }
//     // return isPrime;

//     public static boolean isPrime(int n){
// if(n==2){
//     return true;
// }

//         for(int i = 2;  i<=Math.sqrt(n); i++){
//             if(n%i == 0){
//                 return false;
//             }

          
//         }
//         return true;
//     }

    // public static void primesInRange(int n){
    //     for(int i = 2; i<=n; i++){
    //         if(isPrime(i)){
    //             System.out.println(i + " ");
    //         }
    //     }
    //     System.out.println();
    // }

    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }
    

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("binary form of "+ myNum + " = " + binNum);
    }
    
    
    public static void main(String args[]) {
        decToBin(12);

    }
}

