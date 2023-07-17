import java.util.LinkedHashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        System.out.println(set);

        set.remove(50);

        System.out.println(set);

        System.out.println(set.contains(40));
        System.out.println(set.contains(100));

        System.out.println("Is the set is Empty??: " + set.isEmpty());
        System.out.println(set.size());

    }
}
