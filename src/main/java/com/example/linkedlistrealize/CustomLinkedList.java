package com.example.linkedlistrealize;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void put(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public boolean delete(int data) {
        if (head == null) {
            return false;
        }

        if (head.data == data) {
            head = head.next;
            return true;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    public int get(int index) {
        Node currentNode = head;
        int currentIndex = 0;

        while (currentNode != null) {
            if (currentIndex == index) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
            currentIndex++;
        }

        throw new IndexOutOfBoundsException("Индекс находится за пределами списка.");
    }

    public void reverse() {
        Node prevNode = null;
        Node currentNode = head;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
