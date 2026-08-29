
import java.util.LinkedList;
import java.util.Queue;

class Queue_demo
{
    public static void main(String args[])
    {
        Queue<Integer> number=new LinkedList<>();


        number.offer(10);
        number.offer(30);
        number.offer(40);

        System.out.println("Queue:- "+number);

                System.out.println("Queue:- "+number.poll());


                        System.out.println("Queue:- "+number);




    }
}