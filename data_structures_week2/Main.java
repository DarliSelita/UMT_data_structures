public class Main {

public class Node{
 private int Data;
 private Node next;

 public Node(){
this.Data= Data;
this.next= null;
        }
public int getData(){
     return Data;
}
private void setData(){
     Data=Data;
}
public Node getnext(){
     return next;
}
private void setnext(){
    next=next;
}

}
public class linkedList {
    public Node head;

    public linkedList() {
        this.head = null;
    }

    public void addNode(int Data) {
        Node newNode = new Node();
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.getnext() != null) {
                curr = curr.getnext();
            }
            curr.setnext();
        }
    }

    public void printedList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getnext();
        }
        System.out.println();
    }

    public boolean contains(int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.getData() == (data)) {
                return true;
            }
            curr = curr.getnext();
        }
        return false;
    }

    public int findmax() {
        int max = head.getData();
        Node curr = head.getnext();
        while (curr != null) {
            if ((int) curr.getData() != max) {
                max = curr.getData();
            }
            curr=curr.getnext();
        }
        return max;
    }
    public double findAvg(){
double sum=0.0;
int cnt=0;
Node curr= head;
while(curr!=null){
  sum+= (double)(curr.getData());
cnt++;
curr=curr.getnext();
}
return sum/cnt;
    }

}

}