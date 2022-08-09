import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(23);
        integers.add(11);
        integers.add(17);
        integers.add(13);
        integers.add(34);

        List<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(12);
        integerList.add(25);
        integerList.add(18);

        integerList.addAll(integers);
        Collections.sort(integerList);
        System.out.println(integerList);
    }
}
