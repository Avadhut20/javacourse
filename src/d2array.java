import java.util.*;
public class d2array {
    public static void main(String[ ] args){
        Scanner in= new Scanner(System.in);
        int [][] arr= new int [3][2];
        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }

        }
       /* for(int row =0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));

        }*/
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
