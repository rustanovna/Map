import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;


public class Main {
    public static void main(String[] args) {
        Map<Integer,Product> maps=new HashMap<>();
        maps.put(3,new Product("boll"));
        maps.put(2,new Product("car"));
        maps.put(4,new Product("phone"));
        maps.put(1,new Product("bear"));
        for (Map.Entry<Integer,Product>entry:maps.entrySet()) {
        System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println("\n");
        maps.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Product>comparingByValue())
                .forEach(System.out::println);


    }
}