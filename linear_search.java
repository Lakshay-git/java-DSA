// public class linear_search {

//     public static int linearSearch(int numbers[], int key){
//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] ={2,4,6,8,10,12,14,16};
//         int key = 18;

//         int index = linearSearch(numbers, key);
//         if(index == -1){
//             System.out.println("not found");
//         }else{
//             System.out.println("key is at index "+ index);
//         }


//     }
// }


public class linear_search {

    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {3,5,7,9,10,15,17,19};
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index : " + index);
        }

    }
}

