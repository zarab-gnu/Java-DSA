import java.util.Arrays;

// basic questions (more will be done from leetcode)

public class arrayQus {
    public static void main(String[] args) {
        // swap element
        int[] arr = {1,34,4,56,63,2,345,800};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,5);

        System.out.println(Arrays.toString(arr));

    
        // max element
        System.out.print("maximum element: "); 
        max(arr);

        // reverse array
        reverseArr(arr);

    }
    // method for swap
    static void swap(int[] array, int index1, int index2){
         
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        }
    

    // method for max 
    static void max(int[] array){
        int maxNum=array[0];
        for(int i=1;i<array.length;i++){
                if(array[i]>maxNum){
                    maxNum=array[i];
                }
            }

        System.out.println(maxNum);

    }

    // method for reverse array
    static void reverseArr(int[] array){
        int start = 0;
        int end = array.length -1;
        for(;start<=end;start++){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }
}
