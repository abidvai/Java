import java.util.TreeMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {

        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Tree", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        numbers.putIfAbsent("Two", 23);

        numbers.remove("Three");

        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.containsKey("Four"));

        System.out.println(numbers.isEmpty());

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(numbers);

        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        for (Integer key : numbers.values()) {
            System.out.println(key);
        }
    }
}
