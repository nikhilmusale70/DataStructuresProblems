package com.problem1;

public class MyUnOrderedList<T>{
    Node head;
    int flag=0;

    public void add(T key){
        Node node = new Node();
        node.key = key;
        node.next= null;

        if (head == null){
            head = node;
        }
        else{
            Node n = head;
            while (n.next != null)
                n = n.next;
            n.next=node;
        }
    }

    public void checkIfPresentOrAbsent(T key){
        Node n = head;
        while (n !=null){
            if (n.key.equals(key)){
                System.out.println("The key is present and now deleted from the list");
                flag = 1;
                break;
            }
            n = n.next;
        }
        if (flag==0){
            System.out.println("The key is not present and now is added in the list");
            add(key);
        }
        if (flag==1)
            delete(key);
    }

    public <K> void delete(K key) {
        Node n = head;
        while (n.next != null) {
            if (n.next.key.equals(key)) {
                n.next = n.next.next;
                break;
            }
            else if (n.key.equals(key)){
                deleteAtFirst();
                break;
            }
            else
                n=n.next;
        }
    }

    public void deleteAtFirst(){
        head = head.next;
    }


    public void showList(){
        System.out.println("");
        Node n =head;
        while (n != null){
            System.out.println(n.key);
            n = n.next;
        }
    }

}

