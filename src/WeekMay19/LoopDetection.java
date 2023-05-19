package WeekMay19;

import java.util.HashSet;
import java.util.Set;

public class LoopDetection {

    public static class Node {
        String data;
        Node next;

        Node(String value){
            this.data = value;
            this.next = null;
        }
    }

    public Node detectLoop(Node head){

        if (head == null){
            return null;
        }

        //Store the values
        Set<Node> storage = new HashSet<>();

        Node current = head;

        while (current != null){

            if (storage.contains(current)){
                return current;
            }

            storage.add(current);
            current = current.next;
        }

        return null;
    }

    public static void main(String[] args){

        Node head = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeC;

        LoopDetection loopList = new LoopDetection();
        Node loopNode = loopList.detectLoop(head);

        if(loopNode != null){
            System.out.println("The loop starts at node with value: " + loopNode.data);
        } else {
            System.out.println("No loop found in the linked list.");
        }

    }
}
