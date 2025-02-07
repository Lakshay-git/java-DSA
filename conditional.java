//import java.util.Scanner;

// public class conditional {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age>=18){
//             System.out.println("you can vote");
//             System.out.println("you can Drive");
//             System.out.println("you can got to college ");
//         }
//         else{
//             System.out.println("you are not adult");
//         }
//     }
// }

// print the largest of two 
// public class conditional {

//     public static void main(String args[]){
//         int a = 10;
//         int b = 15;
//         if(a>=b){
//             System.out.println("a is largest of two");
//         }
//         else{
//             System.out.println("b is largest of two ");
//         }
//     }
// }


//print if a number is odd or even

// import java.util.Scanner;

// public class conditional {

//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     if( n % 2 == 0){
//         System.out.println("EVEN");
//     }
//     else{
//         System.out.println("ODD");
//     }

//     }
// }


// income tax calculator 

// public class conditional {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;
//         if(income <= 500000){
//             tax = 0;
//         }
//         else if(income>=500000 && income < 1000000){
//             tax = (int) (income * 0.2);
//         }
//         else{
//             tax = (int) ( income * 0.3);
//         }

//         System.out.println("your tax is : " + tax);
//     }
// }

//import java.util.Scanner;  // Import Scanner class

// public class conditional {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt(); // Read input income
//         int tax;

//         // Tax calculation based on income
//         if (income <= 500000) {
//             tax = 0;
//         } else if (income > 500000 && income < 1000000) {
//             tax = (int) (income * 0.2); // 20% tax for income between 500,000 and 1,000,000
//         } else {
//             tax = (int) (income * 0.3); // 30% tax for income above 1,000,000
//         }

//         // Output the calculated tax
//         System.out.println("Your tax is: " + tax);
//     }
// }


// print the largest of 3 numbers 

// public class conditional {

//     public static void main(String args[]){
//         int a = 1, b = 3 , c = 6 ;
//         if(a>=b && a>=c){
//             System.out.println("a is the largest of three");
//         }
//         else if(b >= c){
//             System.out.println("b is the largest of three");
//         }
//         else{
//             System.out.println("c is the largest of three");
//         }
//     }
// }

// check student will pass or fail 

// public class conditional {

//     public static void main(String args[]){
//         int marks = 88;
//         String reportcard = marks>=33 ? "PASS" : "FAIL";
//         System.out.println(reportcard);
//     }
// }


//switch statement 

// public class conditional {

//     public static void main(String args[]){
//         int number = 6;
//         switch (number) {
//             case 1:System.out.println("burger");
                
//                 break;

//             case 2 : System.out.println("samosa");
//                 break;
//             case 3 : System.out.println("mango shake ");
//                 break;
//             default:System.out.println("we wake up ");

//         }
//     }
// }

// WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative


import java.util.Scanner;

// public class conditional {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         if(a>0){
//             System.out.println("it is a positive number" );
//         }
//         else{
//             System.out.println("it is a negative number");
//         }

//     }
// }





// WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case

// public class conditional {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         switch (a) {
//             case 1: System.out.println("monday");
                
//                 break;
//             case 2: System.out.println("Tuesday");
                
//                 break;
//             case 3: System.out.println("Wednesday");
                
//                 break;
//             case 4: System.out.println("Thursday");
                
//                 break;
//             case 5: System.out.println("Friday");
                
//                 break;
//             case 6: System.out.println("Saturday");
                
//                 break;
//             case 7: System.out.println("Sunday");
                
//                 break;
        
//             default: System.out.println("NO day");
//                 break;
//         }


//     }
// }

// WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or not

public class conditional {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year : ");
        int year = sc.nextInt();

        boolean x= (year%4) == 0;
        boolean y= (year%100) != 0;
        boolean z= ((year%100==0) && (year%400==0));

        if (x && (y || z)){
            System.out.println(year + "is a leap year ");
        }
        else{
            System.out.println(year + " it is not a leap year ");
        }
    }
}


//if year divisible by 4 and divisible by 100 and divisible by 400 then it is a leap year
// A century year (a year divisible by 100) is a leap year only if it is also divisible by 400.

// Key Points:
// A year is a leap year if:

// It is divisible by 4.
// But if it is a century year (divisible by 100), it must also be divisible by 400.
// Examples of century years:

// 1600: Divisible by 400 → Leap year.
// 1700: Not divisible by 400 → Not a leap year.
// 2000: Divisible by 400 → Leap year.
// 2100: Not divisible by 400 → Not a leap year.