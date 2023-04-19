import java.util.*;

public class arraysearch {
    public static void main(String[] args) {
        //search in range


        int[] nums = {23, 4, 3, 2, 4, 5, 66, 19, 25, 33};
        int target = 3;
        int ans = linearSearch(nums, target,1,6);
        System.out.println(ans);
    }

    //search in the array : return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr,int key,int start,int end){
        if(arr.length==0){
            return -1;

        }
        for(int i=0;i<arr.length;i++){
            int element= arr[i];
            if(element==key){
                return i;
            }
        }
        return -1;
    }
}
