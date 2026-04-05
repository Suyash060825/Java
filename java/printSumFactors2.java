import java.util.Scanner;
public class printSumFactors2 {
    static int calculateFactor2(int n) {
        int sum=1;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                if(i!=(n/i)) {
                    sum+=i+(n/i);
                }
                else
                    sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println("Sum of Factors: "+calculateFactor2(input));
        sc.close();
    }
}