
import java.util.Vector;

class vector_demo{
    public static void main(String[] args) {
        
        Vector<String> name=new Vector<>();

        name.add("mango");
        name.add("kiwi");
        name.add("guava");

     System.out.println("total list :- "+name);

     name.remove("kiwi");

          System.out.println("total list :- "+name);

    }
}