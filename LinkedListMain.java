
class Node{
    int data;
    Node next;
    Node(int data){
       this.data = data;
       this.next = null; 
    }
}


public class LinkedListMain {

    Node head = null;

    public void insert(int data)
    {
        System.out.println("insert is called");
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

    }

    public void insertAtPosition(int position, int data)
    {
        try{
            Node newNode = new Node(data);
        Node current = head;

        if(current == null){
            head = newNode;
            return; 
        }
        for(int i=0; i< position-1; i++){
            current = current.next;
        }

        current.next = newNode;
        newNode.next = current;
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }

    public void display()
    {
        System.out.println("display is called");
        Node current = head;
        
        if(current == null)
        {
            System.out.println("Linked list is empty.");
            return;
        }
        System.out.print("Elements are: ");
        while(current != null){

            String val = "null";
            
            System.out.print(" "+current.data+" --> ");

            if(current.next == null)
            {
                System.out.print(val);
            }
        
            current = current.next;
            
        
    }
        
    }


    public static void main(String[] args){
        LinkedListMain newnode = new LinkedListMain();

        newnode.insert(1);
        newnode.insert(2);
        newnode.insert(3);
        newnode.insert(4);
        newnode.insert(5);
        newnode.display();
        
    }
}
