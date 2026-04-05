package Softskills;


public class MyQueue3 {
    int capacity=5;
    int arr[]=new int[capacity];
    int front=-1;
    int rear=0;
    void enqueue(int d)
    {
        if(front==-1)
        {
            front=0;
        }
        arr[rear++]=d;
    }
    void traverse(String desc,int[] arr)
    {
        System.out.println(desc);
        for(int i=front;i<rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void dequeue()
    {
        if(rear==front)
        {
            arr[rear]=0;
            rear--;
            front--;
        }    
        else{
            int ind=1;
            while(ind!=rear)
            {
                arr[ind-1]=arr[ind];
                ind++;
            }
            arr[--rear]=0;
        }
    }
    public static void main(String[] args) {
        MyQueue3 obj=new MyQueue3();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.traverse("Initial phase",obj.arr);
        obj.dequeue();
        obj.traverse("after deletion",obj.arr);
    }
}
