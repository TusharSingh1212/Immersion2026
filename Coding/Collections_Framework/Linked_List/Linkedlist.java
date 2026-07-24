class Linkedlist{
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

    void insertLast(int n){
        Node newNode=new Node(n);
        if(head==null){
            head=newNode;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("\nList is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node cur=head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        cur.next = null;
    }

    void print(){
        System.out.println("\n-----------------------");
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"=>");
            cur=cur.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertLast(50);
        list.insertLast(60);
        list.insertLast(70);
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
        list.deleteLast();
        list.print();
        list.deleteLast();
        list.print();
        list.deleteLast();
        list.print();
        list.deleteLast();
        list.print();
        list.deleteLast();
        list.print();
        list.deleteLast();
        list.print();
    }
}