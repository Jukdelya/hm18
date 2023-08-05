package third;

import java.util.ArrayList;
import java.util.List;

public class DwCast {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("parrot");
        String animal2 = animal.get(2);
        System.out.println(animal2);
    }
}
