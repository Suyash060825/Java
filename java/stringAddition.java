import java.util.Scanner;
public class stringAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String input2=sc.nextLine();
        int number1=Integer.parseInt(input1);
        int number2=Integer.parseInt(input2);
        int result=number1+number2;
        String printResult=Integer.toString(result);
        System.out.println(printResult);
        sc.close();
    }
}
