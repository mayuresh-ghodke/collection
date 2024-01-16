import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueImplementationMain {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(10);
        System.out.println("Size: "+pq.size());
        System.out.println("Peek: "+pq.peek());

        pq.add(12);
        pq.add(31);
        pq.add(9);

        System.out.println("Element method reutrn head element: "+pq.element());
        
        System.out.println("Queue elements are: ");
        Iterator it = pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Is containes 10: "+pq.contains(10));

        System.out.println("Size: "+pq.size());
        System.out.println("Peek: "+pq.peek());



        
    }
}
