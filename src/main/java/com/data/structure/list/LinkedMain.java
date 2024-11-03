package com.data.structure.list;

public class LinkedMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.prepend(1);

        System.out.println("Size: " + linkedList.getSize());
        System.out.println(linkedList);

        linkedList.prepend(2);
        linkedList.prepend(3);

        System.out.println(linkedList);

        linkedList.clear();

        System.out.println(linkedList);
    }
}
