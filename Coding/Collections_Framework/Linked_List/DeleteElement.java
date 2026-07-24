public class DeleteElement {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int n){
            data=n;
            next=null;
        }
    }

    void insertFirst(int n){
        Node newNode=new Node(n);
        newNode.next=head;
        head=newNode;
    }

    void delete(int n){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.data == n){
            head = head.next;
            return;
        }
        Node cur=head;

        while(cur.next != null){
            if(cur.next.data == n){
                break;
            }
            cur = cur.next;
        }

        if(cur.next == null){
            System.out.println("Element not found");
            return;
        }

        cur.next = cur.next.next;
    }

    void print(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteElement list = new DeleteElement();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.print();
        list.delete(30);
        list.print();
        list.delete(40);
        list.print();
        list.delete(100);
        list.delete(10);
        list.print();
        list.delete(20);
        list.print();
    }
}
