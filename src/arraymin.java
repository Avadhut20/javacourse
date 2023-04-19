public class arraymin {
    public static void main(String[] args) {
        int [] arr={23, 4, 3, 2, 4, 5, 66, 19, 25, 33,-66};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }
}
