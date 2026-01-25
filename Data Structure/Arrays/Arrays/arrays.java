import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Syntax
        // datatype[] variable = new datatype[size];
        // can be only one datatype at once

        int[] arr; //declaration of an array. defined in stack memory

        arr = new int[10]; // initialization: object created in heap memory 

        System.out.println(arr[1]); // index 1 of arr, index stars at 0
        // 0 because no data assigned in array

        String[] arr2 = new String[5];
        System.out.println(arr2[3]); // null

        // array of primitive data type 
        // for(int i=0;i<arr.length;i++){ // array input by user
        //     arr[i]=sc.nextInt(); //taking inputs
        //     System.out.println(arr[i]);
        // }
        
        // array of non-primitive data type: objects
        String[] str = new String[3];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next(); //string input
        }

        System.out.println(Arrays.toString(str)); // a way of array printing by using Arrays, but inside its for-loop too

        str[1] = "any"; //changing the value of index 1, arrays are mutable
        System.out.println(Arrays.toString(str));

        // Passing array in function
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        PassingArray(nums);
        System.out.println(Arrays.toString(nums));

        //calling the func in main func
        multiDimensionArray();

        ArrayListMethod();
        

    }

    // Passing array in function
    static void PassingArray(int[] arr){ //another function outside main function but in same class 
        arr[2]=69;
    }


    static void multiDimensionArray(){
        // 2d array
        // Syntax
        // int[][] array = new int[no. of row][no. of col.]
        // Note: declaring number of row is mandatory, not number of columns!

        Scanner sc = new Scanner(System.in);
        
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        // lets take input in 2d array
        int[][] arr2D = new int[3][3];

        for(int row=0; row<arr2D.length;row++){// by length its the number of rows
            //now for every row, we iterate for col.
            for(int col=0;col<arr2D[row].length;col++){ //by length its number of col in each row
                arr2D[row][col]=sc.nextInt();
            }
        }

        //outuput
        for(int row=0; row<arr2D.length;row++){
            //now for every row, we iterate for col.
            for(int col=0;col<arr2D[row].length;col++){
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }
    }

    static void ArrayListMethod(){
        // syntax
        // ArrayList<data type> variable = new ArrayList<data type: "not mandatory here">(capacity);

        ArrayList<Integer> arr = new ArrayList<>(5); //size/capacity doesnt matter here
        // here Integer is written instead of int, because of Wrapper class: will be covered later!

        //add items
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        //output
        System.out.println(arr);
        
        //many other operations can be done after arr with dot (arr.---)

    }
}