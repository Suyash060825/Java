package Softskills;

import java.math.BigInteger;
import java.util.Scanner;
public class stringAddition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        BigInteger number1 = new BigInteger(input1);
        BigInteger number2 = new BigInteger(input2);
        BigInteger result = number1.add(number2);
        System.out.println(result.toString());
        sc.close();
    }
}
