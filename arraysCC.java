import java.util.*;
// public class arraysCC {
//     public static void main(String args[]){
//         int marks[] = new int[100];

//         Scanner sc = new Scanner(System.in);

//         System.out.println("length of an array : " + marks.length);

        // marks[0] = sc.nextInt();//physics
        // marks[1] = sc.nextInt();//chemistry
        // marks[2] = sc.nextInt();//math

        // System.out.println("phy : "+ marks[0]);
        // System.out.println("chemistry : "+ marks[1]);
        // System.out.println("math : "+ marks[2]);

        // // marks[2] = 100;
        // // marks[2] = marks[2] + 1;
        // // System.out.println("math : " + marks[2]);

        // int percentage = ((marks[0] + marks[1] + marks[2]) / 3);
        // System.out.println("percentage : " + percentage + "%" );


//     }
// }

public class arraysCC {

    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {97,98,99};
        int nonChangable = 5;
        update(marks,nonChangable);
        System.out.println(nonChangable);

        //print our marks
        for(int i = 0; i <marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
        
    }
}
