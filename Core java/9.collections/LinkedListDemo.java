
import java.util.LinkedList;


class LinkedListDemo
{
    public static void main(String[] args) {
        LinkedList<String> fruits =new LinkedList<>();

        fruits.add("grapes");
        fruits.add("banana");
        fruits.add("apple");

        fruits.addFirst("mango");
        fruits.addLast("jjajaja");

        System.out.println("linked list is :-"+fruits);
    }
}