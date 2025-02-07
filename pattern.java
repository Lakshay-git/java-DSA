// public class pattern{
//     public static void main(String args[]){
//         for(int line = 1; line<=4; line++){
//             for(int star =1; star<=line; star++){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }


// // // public class pattern {
// // //     public static void main(String args[]){
// // //         for(int line = 1; line<=4; line++){
// // //             for(int star =1; star<=4-line+1 ; star++){
// // //                 System.out.print("*");
// // //             }
// // //             System.out.println( );
// // //         }
// // //     }
// // // }

// // public class pattern {

// //     public static void main(String args[]){
// //         int n = 4;

// //         for(int line = 1; line<=n; line++){
// //             for(int number=1; number<=line; number++){
// //                 System.out.print(number);
// //             }
// //             System.out.println();
// //         }
// //     }
// // }


// public class pattern {

//     public static void main(String args[]){
//         int n = 4;
//         char ch = 'A';
//         for(int line = 1; line<=n; line++){
//             for(int chars = 1; chars<=line; chars++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {

//     public static void main(String args[]){
//         int n = 4;
//         for(int line = 1; line <= n; line++){
//             for(int )
//         }
//     }
// }



public class pattern {

    // public static void hollow_rectangle(int totalRows, int totalColumns){
    //     //outer loop
    //     for(int i = 1; i<=totalRows; i++){
    //         //inner loop for columns
    //         for(int j = 1; j<=totalColumns; j++){
    //             if(i == 1 || i==totalRows || j == 1 || j == totalColumns){
    //                 //boundary cells
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();

    //     }
    // }


    // public static void inverted_rotated_half_pyramid(int n){
    //     //outer for rows
    //     for(int i = 1; i<=n; i++){
    //         //inner loop for spaces
    //         for(int j = 1; j <= n-i; j++){
    //             System.out.print(" ");
    //             }
    //             for(int j = 1; j<=i; j++){
    //                 System.out.print("*");
    //         }
    //         System.out.println();

    //     }
        

    // }

    // public static void inverted_half_pyramid(int n){
    //     //outer loop
    //     for(int i = 1; i<=n; i++){
    //         for(int j=1; j<=n-i+1; j++){
    //             System.out.print(j + "");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void floyds_triangle(int n){
    //     int counter = 1;
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=i; j++){
    //             System.out.print(counter + " ");
    //             counter++;
    //         }
    //         System.out.println();
    //     }
        
    // }

    // public static void zero_one_triangle(int n ){
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=i; j++){
    //             if((i+j) % 2 == 0){
    //                 System.out.print("1");
    //             }
    //             else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void butterfly(int n){
        //1st half
        for(int i = 1; i <=n;i++){
            // stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");

            }
            //stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd-half
        for(int i = n; i>=1; i--){
             // stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");

            }
            //stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
        
       
    }

    public static void rhombus(int n){
        for(int i = 1; i<=n; i++){
            // spaces
            for(int j = 1; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //hollow reactangle
            for(int j = 1; j<=n;j++){
                if(i==1 || i==n || j==1 ||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd-half
        for(int i = n;i>=1;i--){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        // hollow_rectangle(4, 5);
        //inverted_rotated_half_pyramid(4);
        //inverted_half_pyramid(5);
        //floyds_triangle(5);
        //zero_one_triangle(5);
        //butterfly(4);
        // rhombus(5);
        // hollow_rhombus(5);
        diamond(20);
    }
}