import java.util.Arrays;

public class sortedmatrix {
    public static void main(String[] args) {
            int[][] arr={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},

            };
        System.out.println(Arrays.toString(search(arr,10)));
    }
    //search in the row and column
    static int[] binarysearch(int[][]matrix,int row,int colstart,int colend,int target){
        while(colstart<=colend){
            int mid=(colstart+colend)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                colstart=mid+1;

            }
            else {
                colend=mid-1;
            }

        }
        return new int[]{-1,-1};
    }
    static int [] search(int[][]matrix, int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return binarysearch(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        //run the loop till 2 rows are remaining
        while(rStart<(rEnd-1)){
            int mid=(rStart+rEnd)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }
            else{
                rEnd=mid;
            }

        }
        //now we have two rows
        //check whether the target is in column
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};


        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};


        }
        /*
        search in 1st half or 2nd half of in 3rd half
        */
        //1st half
        if (target<=matrix[rStart][cMid-1]){
                return binarysearch(matrix,rStart,0,cMid-1,target);
        }
        //2nd half
        if (target>=matrix[rStart][cMid+1]&&target<=matrix[rStart][cols-1]){
            return binarysearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //3rd half
        if (target<=matrix[rStart+1][cMid-1]){
            return binarysearch(matrix,rStart+1,0,cMid-1,target);
        }
        //4th half
        if (target>=matrix[rStart+1][cMid+1]){
            return binarysearch(matrix,rStart+1,cMid+1,cols-1,target);
        }

        return new int[]{-1,-1};
    }

}
