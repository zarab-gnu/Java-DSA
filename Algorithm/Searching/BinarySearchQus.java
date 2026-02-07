public class BinarySearchQus {
    public static void main(String[] args) {
        
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        // Ceiling of a number in sorted array
        int r1 = ceilingNum(arr, target);   
        System.out.println("ceiling for "+target+" is: "+arr[r1]);

        // floor of a number in sorted array
        int r2 = floorNum(arr, target);   
        System.out.println("floor for "+target+" is: "+arr[r2]);

        // search element from infinite array
        int[] array = {3,5,7,9,10,90,100,130,140,160,170};
        int t=100;
        int result = srchTargetInfinite(array, t);
        System.out.println(result);
    }
    

// method for celiling of a number in sorted array
static int ceilingNum(int[] array, int target){
    int start = 0;
    int end = array.length - 1;
    while(start<=end){
        int mid = start + (end-start)/2;
        if(array[mid]<target){
            start = mid+1;
        }else if(array[mid]>target){
            end = mid-1;
        }else{
            return mid; //original target
        }
    }
    return start; // because condition violated, now start=end+1, and ceiling is next smallest number in the array in bigger nums than target
    }


// method for floor of a number in sorted array
static int floorNum(int[] array, int target){
    int start = 0;
    int end = array.length - 1;
    while(start<=end){
        int mid = start + (end-start)/2;
        if(array[mid]<target){
            start = mid+1;
        }else if(array[mid]>target){
            end = mid-1;
        }else{
            return mid; // original target
        }
    }
    return end; // because condition violated, now start=end+1, and floor is the previous biggest number in small nums than target
    }

//note: same as the original binary search algorithm, just returning start or end index depending on ceiling or floor, instead of -1


// search element from infinite array method
static int srchTargetInfinite(int[] array, int target){
    // increasing size by 2 times each time if target not found
    int start = 0;
    int end = 1; // taking first two elements first
    while(target>array[end]){
        int newStart = end + 1;
        end = end + (end-start+1)*2;
        start = newStart;
    }
    return binSrch(array, target, start, end);
}

//regular binary search algo
static int binSrch(int[] array, int target, int start, int end){
    while(start<=end){
        int mid = start + (end-start)/2;
        if(target<array[mid]){
            end=mid-1;
        }else if(target>array[mid]){
            start=mid+1;
        }else{
            return mid;
        }
    }
    return -1;
}
}