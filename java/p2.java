package Softskills;
import java.util.Scanner;
public class p2 {
    static void traverse(int[] arr){
         System.out.println("array elements are:");
         System.out.println();
         for(int i=0;i<arr.length;i++)
        {
            System.out.println("element at index "+ i+ " is:"+ arr[i]);
            System.out.println();
        }
    }    
    static void insert(int arr[],int ele,int ind)
    {
            int res[]=new int[arr.length+1];
            for(int i=0;i<ind;i++)
            {
                res[i]=arr[i];
            }
            res[ind]=ele;
            for(int i=ind+1;i<res.length;i++)
            {
                res[i]=arr[i-1];
            }
    }
    int[] delete(int []arr,int ind)
    {
        int res[]=new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i!=ind)
            {
                res[j++]=arr[i];
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Hello World!!!");
        System.out.println("Enter size of the array!:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter element "+ i );
            arr[i]=sc.nextInt();
        }
        traverse(arr);

        arr=sc.delete(arr,3);
        sc.traverse(arr);

        
        insert(arr,4,5);

        sc.close();
    }
}
