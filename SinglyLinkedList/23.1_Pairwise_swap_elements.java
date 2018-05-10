import java.util.HashMap;

class Node
{
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 
// Linked List class
class LinkedList
{
    Node head;  // head of list
    int size;
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
        size ++;
    }

    public void pairwise_swap_elements(){
        
       Node temp = head;

       while(temp!=null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            if(temp!=null && temp.next!=null && temp.next.next!=null){
                temp = temp.next.next;
            }
            else{
                break;
            }

            
       }

       printList(head);
    }

    public void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
         System.out.print("\n");
    }
 
   
    public static void main(String[] args){
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);        
        llist.push(5);
        llist.push(6);
        llist.pairwise_swap_elements();
    }
}