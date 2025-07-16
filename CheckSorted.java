// import java.util.*;

// public class basicSorting {

//     public static void bubbleSort(int arr[]){
//         for(int turn = 0; turn < arr.length-1; turn++){
//             for(int j = 0; j < arr.length-1-turn; j++){
//                 if(arr[j] > arr[j+1]){
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
    
//     public static void printArr(int arr[]){
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
    
//     public static void selectionSort(int arr[]){
//         for(int i = 0; i<arr.length-1; i++){
//             int minPos = i;
//             for(int j = i+1; j<arr.length;j++){
//                 if(arr[minPos]>arr[j]){
//                     minPos = j;
//                 }
//             } 
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }


//     public static void insertionSort(int arr[]){
//         for(int i = 1; i<arr.length; i++){
//             int curr = arr[i];
//             int prev = i-1;
//             //finding out the correct position to insert 
//             while(prev >=0 && arr[prev] > curr){
//                 arr[prev+1] = arr[prev];// iska mtlb bas right shift karna 
//                 prev--;
//             }
//             //insertion
//             arr[prev+1] = curr;
//         }
//     }

//     public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0; i<arr.length; i++){
//             largest = Math.max(largest, arr[i]);
//         }
//         int count[] = new int[largest+1];
//         for(int i = 0; i<arr.length; i++){
//             count[arr[i]]++;
//         }
//         //sorting
//         int j = 0;
//         for(int i= 0; i<count.length; i++){
//             while(count[i]>0){
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void main(String args[]){
//         int arr[] = {1,4,1,3,2,4,3,7};
//         //bubbleSort(arr);
        
//         //selectionSort(arr);
//         //insertionSort(arr);
//         // Arrays.sort(arr);
//         countingSort(arr);
//         printArr(arr);

//     }
// }

// // optimized code 
// // public class basicSorting {
    
// //     public static void bubbleSort(int arr[]){
// //         int swapCount = 0;
// //         for(int turn = 0; turn < arr.length-1; turn++){
            
// //             boolean swapped = false;
// //             for(int j = 0; j < arr.length-1-turn; j++){
// //                 if(arr[j] > arr[j+1]){
// //                     //swap
// //                     int temp = arr[j];
// //                     arr[j] = a4,rr[j+1];
// //                     arr[j+1] = temp; 
// //                     swapCount++;
// //                     swapped = true;
// //                 }
// //             }
// //             if(!swapped){
// //                 break;
// //             }
// //         }
// //         System.out.println("Total Swaps: " + swapCount);
// //     }
    
// //     public static void printArr(int arr[]){
// //         for(int i = 0; i<arr.length; i++){
// //             System.out.print(arr[i] + " ");
// //         }
// //         System.out.println();
// //     }
    


// //     public static void main(String args[]){
// //         int arr[] = {1,2,3,4,5};
// //         System.out.println("Original Array:");
// //         printArr(arr);

// //         bubbleSort(arr);
// //         System.out.println("Sorted Array:");
// //         printArr(arr);

// //     }
// // }


// descending selection sort 
// public class SelectionSort {
//     public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 3};

//         for (int i = 0; i < arr.length - 1; i++) {
//             int max = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[max]) {
//                     max = j;
//                 }
//             }

//             // Swap
//             int temp = arr[i];
//             arr[i] = arr[max];
//             arr[max] = temp;
//         }

//         // Print sorted array
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//insertion descending 
// public class InsertionSortDescending {
//     public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 3};

//         for (int i = 1; i < arr.length; i++) {
//             int current = arr[i];
//             int j = i - 1;


//             while (j >= 0 && arr[j] < current) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }

//             arr[j + 1] = current;  
//         }


//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }


public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 4, 2};  

        if (isSortedAscending(arr)) {
            System.out.println("Array is sorted in ascending order.");
        } else if (isSortedDescending(arr)) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    public static boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
