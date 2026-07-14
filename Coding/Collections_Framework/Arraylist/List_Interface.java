import java.util.ArrayList;

public class List_Interface{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Rahul");
        list.add("Sachin");
        list.add("Harshit");
        list.add("Tushar");

        System.out.println(list);

        list.remove("Rahul");
        System.out.println(list);
        list.set(0, "Hello");

        System.out.println(list);
    }
}