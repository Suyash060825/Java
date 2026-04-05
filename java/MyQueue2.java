package Softskills;
class NodeQueue2
{
    int data;
    int priority;
    NodeQueue2 next;
    NodeQueue2(int d,int p)
    {
        data=d;
        priority=p;
    }
}
class MyQueue2
{
    NodeQueue2 head;
    void enqueue(int d,int p)
    {
        NodeQueue2 newnode=new NodeQueue2(d,p);
        if(head==null)
        {
            head=newnode;
        }
        else{
            NodeQueue2 current=head;
            if(current.priority>p)
            {
                newnode.next=head;
                head=newnode;
            }
            else{
                while(current!=null && current.next!=null && current.next.priority<p)
                {
                    current=current.next;
                }
                newnode.next=current.next;
                current.next=newnode;

            }
        }
        
    }

    void traverse(String desc,NodeQueue2 head)
    {
        System.out.println(desc);
        NodeQueue2 current=head;
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
        MyQueue2 obj=new MyQueue2();
        obj.enqueue(10,2);
        obj.enqueue(20,1);
        obj.enqueue(30,5);
        obj.enqueue(40,4);
        obj.enqueue(50,3);
        obj.traverse("Initial phase",obj.head);
        obj.dequeue();
        obj.traverse("After deletion",obj.head);
    }
}