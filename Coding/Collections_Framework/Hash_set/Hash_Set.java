import java.util.HashSet;

public class Hash_Set{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(50);

        System.out.println(set);

        for (int num : set) {
            System.out.println(num);
        }
    }
}