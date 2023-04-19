import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args){
        //Syntax
        ArrayList<Integer> List= new ArrayList<>(10);
        /*List.add(67);
        List.add(672);
        List.add(672);
        List.add(671);
        List.add(673);
        List.add(674);
        List.add(675);
        List.add(676);
        List.add(678);
        System.out.println(List);*/
        //input
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            List.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(List.get(i));
        }



    }
}
