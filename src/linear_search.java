public class linear_search {
    public static void main(String[] args) {
    int[] nums={23,4,3,2,4,5,6,19, 25, 33};
    int target=19;
    int ans=linearSearch(nums,target);
    System.out.println(ans);
    }
    //search in the array : return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr,int key){
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
