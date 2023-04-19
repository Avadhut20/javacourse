import java.util.*;


public class binary_search {
    public static void main(String[] args) {
        int [] arr={2,4,5,44,66,78,89,90};
        int ans=binarysearch(arr,4);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }

        }
        return -1;
    }
}
