
// // public class strings {

//     // public static void printLetters(String str){
//     //     for(int i = 0; i<str.length(); i++){
//     //         System.out.print(str.charAt(i)+" ");

//     //     }
//     //     System.out.println();
//     // }

//     //public static void main(String args[]){
//         // Scanner sc = new Scanner(System.in);
//         // String name;
//         // name = sc.nextLine();
//         // System.out.println(name);

//         // String fullName = "Lakshay Soni";
//         // System.out.println(fullName.length());

//         //concatination

// //         String firstName = "lakshay";
// //         String lastName = "soni";
// //         String fullName = firstName + " " + lastName;
// //        printLetters(fullName);


// //     }
// // }


// //palindrome code

// public class strings {

    


// // public static boolean isPalindrome(String str){
// //     for(int i = 0; i<str.length()/2; i++){
// //         int n = str.length();
// //         if(str.charAt(i) != str.charAt(n-i-1)){
// //            return false;
// //         }
// //     }
// //     return true;
// // }

// // public static float getShortestPath(String path){
// //     int x = 0, y = 0;
// //     for(int i = 0; i<path.length(); i++){
// //     char dir = path.charAt(i);
// //     //soth
// //     if(dir == 'S'){
// //         y--;
// //     }
// //     else if(dir == 'N'){
// //         y++;
// //     }
// //     else if(dir == 'W'){
// //         x--;
// //     }
// //     else{
// //         x++;
// //     }
// // }

// //     int X2 = x*x;
// //     int Y2 = y*y;
// //     return (float)Math.sqrt(X2 + Y2); 



// // }


// // public static void main(String args[]){
// //     // String str = "racecar";
// //     String path = "WNEENESENNN";
// //     System.out.println(getShortestPath(path));
// // }

// public static void main(String args[]){
//     String s1 = "Tony";
//     String s2 = "Tony";
//     String s3 = new String("Tony");

//     if(s1 == s2){
//         System.out.println("strings are equal");

//     }
//     else{
//         System.out.println("string are not equal");
//     }

//     if(s1 == s3){
//         System.out.println("strings are equal");

//     }
//     else{
//         System.out.println("string are not equal");
//     }
//     if(s1.equals(s3)){
//         System.out.println("strings are equal");

//     }
//     else{
//         System.out.println("string are not equal");
//     }

// }





// }







public class strings {

    // public static String substring(String str,int si, int ei){
    //     String substr = "";
    //     for(int i = si; i<ei; i++){
    //         substr += str.charAt(i);
    //     }
    //     return substr; 
    // }
    public static void main(String args[]){
        String str = "hellowold";
        //System.out.println(substring(str, 0, 5));
        System.out.println(str.substring(0,5) );
    }
}
    