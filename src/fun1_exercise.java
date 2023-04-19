import java.util.*;

public class fun1_exercise {
    public static int calculateAvg(int a, int b, int c){
        int average= (a+b+c)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        float avg=calculateAvg(a,b,c);
        System.out.print(avg);

    }
}
