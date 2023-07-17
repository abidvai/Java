import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class map {
    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Tree", 3);
        numbers.put("four", 4);
        numbers.put("Five", 5);

        numbers.putIfAbsent("Two", 23);

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
