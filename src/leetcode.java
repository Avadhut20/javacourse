//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/933612045/

public class leetcode {
    public static void main(String[] args) {
        int []nums={12,345,2,6,7896};
        System.out.println(digits2(55555));

    }
    static int findNumbers(int []nums){
        int count=0;
        for(int num:nums)
        {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static int digits2(int num){
        return (int)(Math.log10(num))+1;
    }
    static boolean even(int num){
        int numberOfDigits=digits(num);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;

    }
}
