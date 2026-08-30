
import java.util.HashMap;


class HashMap_demo
{
public static void main(String args[])
{
    HashMap<Integer,String> Students=new HashMap<>();
    

    Students.put(101,"shreyas");
    Students.put(102,"tanishq");

    Students.put(103,"soham"); 

    System.out.println("names:- "+Students);

    System.out.println("to get info of particular student with :-"+Students.get(102));

    Students.remove(102);

    System.out.println(Students);

}
}