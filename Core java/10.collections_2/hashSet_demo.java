
//only removing duplicates no sorting 
import java.util.HashSet;

class hashSet_demo
{
    public static void main(String[] args) {
        HashSet<Integer> number=new HashSet<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(10);

        System.out.println("series after applying hashset is :-"+number);
    }
}