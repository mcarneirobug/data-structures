package com.data.structure.tree;

public class Node <T extends Comparable<T>> {
    private Node<T> left, right;
    private final T data;

    public Node(T data) {
        this.data = data;
    }

    public void insert(T value) {
        if (value.compareTo(data) <= 0) {
            if (left == null) {
                left = new Node<>(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node<>(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(T value) {
        if (value.compareTo(data) == 0) {
            return true;
        } else if (value.compareTo(data) < 0) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else  {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.println(data);
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPostOrder() {
        if (left != null) {
            left.printPostOrder();
        }
        if (right != null) {
            right.printPostOrder();
        }
        System.out.println(data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", data=" + data +
                '}';
    }
}
