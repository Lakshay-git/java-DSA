// public class binarysearch {

//     public static int binarySearch(int numbers[], int key){
//         int start = 0,  end = numbers.length-1;
//         while(start<=end){
//             int mid = (start + end)/2;

//             //comparisions
//             if(numbers[mid] == key){//found
//                 return mid;
//             }
//             if(numbers[mid]<key){//right
//                 start = mid -1;
//             }else{//left
//                 end = mid + 1;
//             }
            
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14};
//         int key = 10;

//         System.out.println("key is at index : " + binarySearch(numbers,key));
//     }
// }

public class binarysearch {

    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {14,12,10,8,6,4,2};
        int key = 10;

        System.out.println("Key is at index: " + binarySearch(numbers, key));
    }
}
