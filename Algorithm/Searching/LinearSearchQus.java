import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchQus {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Character Search in String
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print("Enter a character to search: ");
    char target = sc.next().charAt(0);
    boolean r = SearchStr(str, target);
    System.out.println(r);

    // Search in a range
    int[] arr = {23,45,12,67,34,89,90};   
    System.out.print("Enter start index: ");
    int start = sc.nextInt();
    System.out.print("Enter end index: ");
    int end = sc.nextInt();
    System.out.print("Enter target to search: ");
    int t = sc.nextInt();
    int res = rangeSrch(arr,start, end, t);
    System.out.println(res);

    // Minimum number in array
    System.out.println(minNum(arr));

    // Search in 2D array
    int[][] m = {  
        {23,45,12},
        {67,34,89,64},
        {90,11}
    };
    int tar = 89;
    int[] result = arr2Dsrch(m, tar);
    System.out.println(Arrays.toString(result));
   }

   // character search in string method
   static boolean SearchStr(String str, char target){
    if(str.length()==0){
        return false;
    }
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==target){
            return true;
        }
    }
    return false;
   }

   // Search in a range method
   static int rangeSrch(int[] array, int Start, int End, int Target){
    if(array.length==0){
        return -1;
    }
    for(int i=Start;i<=End;i++){
        if(array[i]==Target){
            return i;
        }
    }
    return -1;
   }

   static int minNum(int[] array){
    
    if(array.length==0){
        return -1;
    }

    int min = array[0];

    for(int i=1;i<array.length;i++){
        if(array[i]<min){
            min = array[i];
        }
    }
    return min;
   }

   // Search in 2D array method
   static int[] arr2Dsrch(int[][] array, int target){
    if(array.length==0){
        return new int[]{-1,-1};
    }
    for(int i=0; i<array.length;i++){
        for(int j=0;j<array[i].length;j++){
            if(array[i][j]==target){
                return new int[]{i,j}; // with new int[] we are intializing an array to return row and column index
            }
        }
    }
    return new int[]{-1,-1};
   }

   
   // separate class (run separately with main function added)

    // Leetcode problem: 1672. Richest Customer Wealth

   class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int n:wealth(accounts)){
            if(n>max){
                max=n;
            }
        }
        return max;
    }

    int[] wealth(int[][]accounts){
        int[] total=new int[accounts.length];
        int cash;
        for(int i=0;i<accounts.length;i++){
            cash=0;
            for(int j=0;j<accounts[i].length;j++){
                cash+=accounts[i][j];
            }
            total[i]=cash;
        }
        return total;
    }
}

   // 1295. Find Numbers with Even Number of Digits

   class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (even(num)) {
                    count++;
                }
            }
            return count;
        }

        boolean even(int num) {
            if (digits(num) % 2 == 0)
                return true;
            return false;
        }

        int digits(int num) {
            int count = 0;
            while (num > 0) {
                count++;
                num = num / 10;
            }
            return count;
        }

}


}
