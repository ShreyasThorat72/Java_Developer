import java.util.Stack;
class Stack_demo
{
    public static void main(String args[])
    {
        Stack<Integer> number=new Stack<>();

        number.add(10);
        number.add(20);
        number.add(40);

        System.out.println("Stack: "+number);

        System.out.println("popped element "+number.pop());

        System.out.println("stack after pop "+number);

        System.out.println("again popping "+number.pop());

                 System.out.println("stack after pop "+number);
 

    }
}