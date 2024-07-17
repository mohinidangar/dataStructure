package dataStructure;

import java.util.Scanner;
    
class ExampleLL {
    public static void main(String[] args) {
        Linkedlist obj = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("\n1. Append");
            System.out.println("\n2.Traverse");
            System.out.println("\n3.Append At Begin");
            System.out.println("\n4.Append At End");
            System.out.println("\n5.Delete At Begin");
            System.out.println("\n6.Delete At End");
            System.out.println("\n0. Exit");
            System.out.println("Enter Choice:");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    obj.append(sc);
                    break;
                case 2:
                    obj.traverse();
                    break;
                case 3:
                    obj.appendAtBegin(sc);
                    break;
                case 4:
                    obj.appendAtEnd(sc);
                    break;
                case 5:
                    obj.deleteAtBegin();
                    break;
                case 6:
                    obj.deleteAtEnd();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
@SuppressWarnings("unused")
class Linkedlist {

    public class GetNode {
        int data;
        GetNode next;

        GetNode() {
            next = null;
        }
    }

    GetNode head = null;

    public void append(Scanner sc) {
        int data;
        System.out.println("\n Enter Data:");
        data = sc.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;
        if (newNode == null) {
            System.out.println("\n Memory is not present");
        }else if (head == null) {
            head = newNode;
        } else {
            GetNode ptr;
            ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
            System.out.println("\n New node is added");
        }

    }

    void traverse() {
        GetNode ptr;
        ptr = head;
        if (head == null) {
            System.out.println("Empty Linkedlist");
        } else {
            while (ptr != null) {
                System.out.print(ptr.data + "->");
                ptr = ptr.next;
            }
        }
        System.out.println();
    }

    public void appendAtBegin(Scanner sc) {
        int data;
        System.out.println("\n Enter Data:");
        data = sc.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void appendAtEnd(Scanner sc) {
        GetNode ptr;
        ptr = head;
        int data;
        System.out.println("\n Enter Data:");
        data = sc.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;
        while (ptr.next != null) {
            ptr = ptr.next;

        }
        ptr.next = newNode;
    }

    public void deleteAtBegin() {
        GetNode ptr;
        ptr = head;
        head = head.next;
    }

    public void deleteAtEnd(){
        GetNode ptr = head;
        GetNode prev = null;
        if(head == null){
            return;
        }
        while(ptr.next != null){
            prev = ptr;
            ptr = ptr.next;
        }
        if(prev == null){
            head = null;
        } else {
            prev.next = null;
        }

    }
}