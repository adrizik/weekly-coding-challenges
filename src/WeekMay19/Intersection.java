package WeekMay19;

public class Intersection {

    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node findIntersection(Node headA, Node headB){

        if(headA == null || headB == null){
            return null;
        }

        Node currentA = headA;
        Node currentB = headB;

        while(currentA != currentB) {

            if(currentA == null){
                currentA = headB;
            } else {
                currentA = currentA.next;
            }

            if (currentB == null){
                currentB = headA;
            } else {
                currentB = currentB.next;
            }
        }

        return currentA;
    }

    public static void main(String[] args){

        Intersection myLinkedList = new Intersection();

        Node headA = myLinkedList.new Node(3);
        Node node4 = myLinkedList.new Node(4);
        Node node5 = myLinkedList.new Node(5);
        Node node6 = myLinkedList.new Node(6);
        Node node7 = myLinkedList.new Node(7);


        headA.next = node4;
        node4.next = node5;
        node5.next = node6;


        Node headB = myLinkedList.new Node(1);
        Node node2 = myLinkedList.new Node(2);

        headB.next = node2;
        node2.next = node4;

        Node intersectingNode = myLinkedList.findIntersection(headA, headB);

        if(intersectingNode != null){
            System.out.println("Intersection Node: " + intersectingNode.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}
