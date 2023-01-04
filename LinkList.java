// I declare that all the solutuions given are my own and are not taken from internet or any other source
public class LinkList {

    Node head;
    static void insertAtEnd(LinkList l, int d)
    {
        Node n = new Node(d);
        if (l.head == null)
        {
            l.head = n;
        }
        else
        {
            Node ptr = l.head;
            int len = 1;
            while (ptr.next != null) {
                ptr = ptr.next;
                len++;
            }

            if (ptr.next == null) {
                ptr.next = n;
                len++;
            }
        }
    }


    static void display(LinkList l)
    {
        if(l.head==null)
        {
            System.out.println("linkList not present");
        }
        else
        {

            Node ptr=l.head;
           // System.out.println(ptr.data);
            while(ptr.next!=null)
            {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
    static Node KthFromLast(LinkList li, int k)
    {
        Node ptr=li.head;
        Node temp=li.head;
        for(int i=1;i<=k;i++)
        {
            temp=temp.next;
        }
        while(temp.next!=null)
        {
            ptr=ptr.next;
            temp=temp.next;
        }
        return ptr;
    }
    public static void main(String[] args)
    {
        LinkList li=new LinkList();
        int temp=1;

            for(int i=0;i<=10;i++)
            {
                temp=temp+(i*temp); // just some random calculation generating a new number;
                insertAtEnd(li,temp);
            }
            System.out.println(KthFromLast(li,3).data);
            display(li);
        }

}
