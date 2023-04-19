
import java.util.*;
public class binray_search_2d
{
    public static void main(String[] args) {
    // matrix is sorted in a row wise and column wise
        /*{[10,20,30,40]
            [11,25,35,45]
            [28,29,37,49]
            [33,34,38,50]
            } target=37
            OPTIMIZED APPROACH:
            3 CONDITIONS:
            CASE 1: IF(ELEMENT== TARGET)=ANS FOUND
            CASE2: IF ELEMENT<TARGET= ROW++
            CASE 3: IF ELEMENT>TARGET=COL--
            */
        int[][]arr={
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50},

        };
        int target=37;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][]matrix, int target){
        int r=0;//row
        int c=matrix.length-1;//col

        while(r<matrix.length&&c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            else if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
