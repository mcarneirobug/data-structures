package com.data.structure.tree;

public class TreeMain {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(10);
        root.insert(5);
        root.insert(8);
        root.insert(15);

        System.out.println("### PRINT IN ORDER ###");
        root.printInOrder();
        System.out.println("### PRINT PRE ORDER ###");
        root.printPreOrder();
        System.out.println("### PRINT POST ORDER ###");
        root.printPostOrder();

        System.out.println("### EXISTS (5)? ###");
        System.out.println(root.contains(5));

        System.out.println("### EXISTS (15)? ###");
        System.out.println(root.contains(15));

        System.out.println("### EXISTS (10) - root? ###");
        System.out.println(root.contains(10));

        System.out.println("### EXISTS (unknown)? ###");
        System.out.println(root.contains(20));

        System.out.println("### TREE ###");
        System.out.println(root);


        //         (10)
        //        /    \
        //    (5)     (15)
        //      \
        //     (8)
    }
}
