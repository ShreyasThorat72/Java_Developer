
import java.util.ArrayList;


class Remove_ArrayList
{
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();

        name.add("Shreyas");
        name.add("Munna anna");
        name.add("gamer");

        name.remove("Munna anna");

        System.out.println("array list after removing names:-"+name);
    }
}

