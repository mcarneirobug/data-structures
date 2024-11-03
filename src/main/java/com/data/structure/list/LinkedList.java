package com.data.structure.list;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> lastNode;
    private int size;

    /*
    * Insert element on beginning
     */
    public void prepend(T data) {
        Node<T> node = new Node<>(data);
        if (this.size == 0) {
            this.head = node;
        } else {
            this.lastNode.setNext(node);
        }
        this.lastNode = node;
        this.size++;
    }

    public int getSize() {
        return size;
    }

    public void clearEasierAndNotOptimizerWay() {
        this.size = 0;
        this.head = null;
        this.lastNode = null;
    }

    public void clear() {

        for (Node<T> current = this.head; current != null;) {
            Node<T> next = current.getNext();
            current.setData(null);
            current.setNext(null);
            current = next;
        }

        this.head = null;
        this.lastNode = null;
        this.size = 0;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        if (this.size == 0) return "[]";

        Node<T> current = this.head; // first position on list

        if (this.size == 1) return "[" + sb.append(current.getData()) + "]";

        sb.append("[").append(current.getData()).append(",");
        while (current.getNext() != null) {
            current = current.getNext();
            sb.append(current.getData()).append(",");

            if (current.getNext() == null || this.size == 1) {
                var lastCharacter = sb.lastIndexOf(",");
                sb.deleteCharAt(lastCharacter);
            }
        }

        return sb.append("]").toString();
    }
}
