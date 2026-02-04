public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,3,4, 12, 21, 34, 42, 234, 3233, 5234, 34532,43345, 2333342};
        int r = binarySrch(arr, 234);
        System.out.println(r);

    }

    // function for binary search algorithm
    // will return the target element's index
    static int binarySrch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while(start<=end){ // while loop because loop till the condition breaks, no particular range like for loop has
            int mid = start + (end-start)/2;
            // System.out.println(mid);
            if(target<array[mid]){
                end = mid-1;
            }else if(target>array[mid]){
                start = mid+1;
            }else{ // here mid is the target element, so we return the index of mid
                return mid;
            }
        }
        return -1;

    }
}
