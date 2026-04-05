
import java.util.Scanner;

public class eachDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String number = Integer.toString(a);
        boolean flag = true; 
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0'; 
            if (digit == 0 || a % digit != 0) { 
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        sc.close();
    }
}
