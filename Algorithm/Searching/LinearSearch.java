import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1,35, 435, 3, 234, 435,7 ,3423, 6, 342, 4756, 6};
        // if similar value is there multiple times, it will return the first one's index
        // because it starts iterating from index=0, and ends iterating as soon as the item is found
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        int r = linSrch(array, target);
        if(r==-1){
            System.out.println("Target value do not exist");
        }
        else
            System.out.println("Target value is at index: "+r);
    }

    static int linSrch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1; // because index can't be -1
    }
}
