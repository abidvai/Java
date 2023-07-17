import java.util.TreeSet;
import java.util.Set;

public class treeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(33);
        set.add(22);
        set.add(55);
        set.add(87);
        set.add(11);

        System.out.println(set);
    }
}
