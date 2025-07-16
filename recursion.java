// // //print numbers from n to 1 (decreasing order)
// // public class recursion {

// //     public static void printDec(int n ){
// //         if(n == 1){
// //             System.out.print(n);
// //             return;
// //         }
// //         System.out.print(n+ " ");
// //         printDec(n-1);
// //     }

// //     public static void main(String args[]){
// //         int n = 10;
// //         printDec(n);

// //     }
// // }



// // //sum of array using recursion 

// // public class recursion {


// //     public static int sum(int[] arr, int index) {

// //         if (index == arr.length) {
// //             return 0;
// //         }


// //         return arr[index] + sum(arr, index + 1);
// //     }

// //     public static void main(String[] args) {
// //         int[] arr = {1, 2, 7, 5, 9, 2};
// //         int total = sum(arr, 0); 
// //         System.out.println("Sum of array: " + total);
// //     }
// // }




// public class recursion {

//     public static int reverseSum(int[] arr, int index) {

//         if (index < 0) return 0;


//         System.out.print(arr[index] + " ");


//         return arr[index] + reverseSum(arr, index - 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 7, 5, 9, 2};
//         System.out.print("Elements in reverse: ");
//         int total = reverseSum(arr, arr.length - 1);  
//         System.out.println("\nSum: " + total);
//     }
// }





// public class recursion {

//     public static void printInc(int n){
//         if(n == 1){
//             System.out.print(n + " ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n+ " ");
//     }
//     public static void main( String args[]){
//         int n = 10;
//         printInc(n);
//     }
// }


// public class recursion{
//     public static int fact(int n ){
//         if(n==0){
//         return 1;
//         }
//         int fnm1 = fact(n - 1);
//         int fn = n * fact(n-1);
//         return fn;

//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println(fact(n));
//     }

//     }


public class recursion {

    public static int sum(int n){
        if(n <= 0){
            return 0;
        }
        
        return n + sum(n-1);

    }
    public static void main(String args[]){
        int n = 5;
        int result = sum(n);
        System.out.println(result);
    }
}