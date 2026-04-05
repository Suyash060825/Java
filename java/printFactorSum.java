import java.util.Scanner;
public class printFactorSum {
    int calculateFactor(int n) {
        int sum=0;
        System.out.print("Factors are: ");
        for(int i=1;i<n;i++) {
            if(n%i==0) {
                sum+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printFactorSum obj =new printFactorSum();
        int input=sc.nextInt();
        System.out.println("Sum of Factors: "+obj.calculateFactor(input));
        sc.close();
    }
}
