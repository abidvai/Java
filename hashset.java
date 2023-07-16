import java.util.Set;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(34);
        set.add(45);
        set.add(23);
        set.add(65);

        System.out.println(set);

        set.remove(23);

        System.out.println(set);

        System.out.println(set.contains(34));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
