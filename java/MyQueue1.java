package Softskills;
class NodeQueue1
{
    int data;
    NodeQueue1 next;
    NodeQueue1(int d)
    {
        data=d;
    }
}
class MyQueue1
{
    NodeQueue1 head;
    void enqueue(int d)
    {
        NodeQueue1 newnode=new NodeQueue1(d);
        if(head==null)
        {
            head=newnode;
        }
        else{
            NodeQueue1 current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
    }

    void traverse(String desc,NodeQueue1 head)
    {
        System.out.println(desc);
        NodeQueue1 current=head;
        while(current!=null)
        {
            System.out.print(current.data + " ");
            current=current.next;
        }
        System.out.println("");
    }

    void dequeue()
    {
        head=head.next;
    }
    public static void main(String[] args) {
        MyQueue1 obj=new MyQueue1();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.traverse("Initial phase",obj.head);
        obj.dequeue();
        obj.traverse("After deletion",obj.head);
    }
}