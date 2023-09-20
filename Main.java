import java.util.ArrayList;
import java.util.List;

public class Main {
  public static List<Object> flatMap(List<Object> array) {
    List<Object> flatResult = new ArrayList<>();
    for (Object item : array) {
        if (item instanceof List) {
            flatResult.addAll(flatMap((List<Object>) item));
        } else {
            flatResult.add(item);
        }
    }
    return flatResult;
  }

  public static void main(String[] args) {
    List<Object> array = new ArrayList<>();
    List<Object> array1 = new ArrayList<>();
    List<Object> array2 = new ArrayList<>();
    List<Object> array3 = new ArrayList<>();

    array3.add(8);
    array3.add(22);
    array2.add(27);
    array1.add(array2);
    array1.add(18);
    array.add(array1);
    array.add(array3);

    System.out.println(flatMap(array));
  }
}
