
import java.util.TreeSet;


class TreeSet_demo
{
    public static void main(String args[])
    {
        TreeSet<Integer> number=new TreeSet<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(10);

        System.out.println("numbers with no duplicates and sorted order are :-"+number);
    }
}