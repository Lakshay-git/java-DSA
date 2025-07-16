// // public class subarray {
    
// //     public static void printSubArrays(int numbers[]){
// //         for(int i = 0; i<numbers.length; i++){
// //             int start = i;
// //             for(int j = i; j<numbers.length; j++){
// //                 int end = j;
// //                 for(int k = start; k<=end; k++){
// //                     System.out.print(numbers[k] + "");
// //                 }
// //                 System.out.println();
// //             }
// //             System.out.println();
// //         }
// //     }
// //     public static void main(String args[]){
// //         int numbers[] = {2,4,6,8,10,12,14};
// //         printSubArrays(numbers);
        
            
// //         }
// //     }


// // public class subarray {
    
// //     public static void maxSubArrays(int numbers[]){

// //         int currSum = 0;
// //         int maxSum = Integer.MIN_VALUE;
// //         for(int i = 0; i<numbers.length; i++){
// //             int start = i;
// //             for(int j = i; j<numbers.length; j++){
// //                 int end = j;
// //                 currSum = 0;
// //                 for(int k = start; k<=end; k++){
// //                     currSum += numbers[k];
// //                 }
// //                 System.out.println(currSum);
// //                 if(currSum > maxSum){
// //                     maxSum = currSum;
// //                 }
// //             }
            
// //         }
// //         System.out.print("max sum is " + maxSum);
// //     }
// //     public static void main(String args[]){
// //         int numbers[] = {2,4,6,8,10};
// //         maxSubArrays(numbers);
        
            
// //         }
// //     }


public class subarray {
    
    public static void maxSubArrays(int numbers[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[numbers.length];
        prefixSum[0] = numbers[0]; 
        //calculate prefix array
        for(int i = 1; i<numbers.length; i++){
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }



        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];

               
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
            
        }
        System.out.print("max sum is " + maxSum);
    }


    public static void kadanes(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
           
        }
        System.out.println("max sum is " + ms);
    }




    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
            
        }
    }


