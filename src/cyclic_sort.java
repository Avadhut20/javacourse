import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int []arr={3,2,4,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }



    static void sort(int []nums){
        int i=0;
        while(i< nums.length){
            int correct =nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[]arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
