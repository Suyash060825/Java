import java.util.Scanner;
public class stringAddition3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(solve(s1,s2));
        sc.close();
    }

    static String solve(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        while(len1<len2) {
            s1="0"+s1;
            len1++;
        }
        while(len2<len1) {
            s2="0"+s2;
            len2++;
        }
        int carry=0;String res="";
        for(int i=len1-1;i>=0;i--) {
            int d1=s1.charAt(i)-'0';
            int d2=s2.charAt(i)-'0';
            int sum=d1+d2+carry;
            res=(sum%10)+res;
            carry=sum/10;
        }
        if(carry==1) {
            res="1"+res;
        }
        return res;
    }
}
