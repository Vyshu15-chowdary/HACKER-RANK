import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {

    public static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data); // print on new line
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // number of nodes
        Node head = null;

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            head = insertAtTail(head, data);
        }

        printList(head);
        scanner.close();
    }
}
