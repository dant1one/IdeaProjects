import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> empIds = new HashMap<>();
        empIds.put("Jhon", 2345);
        empIds.put("Je", 2345);
        empIds.put("Jo", 2345);
        System.out.println(empIds);
        System.out.println(empIds.containsKey("Jo"));
    }
}
