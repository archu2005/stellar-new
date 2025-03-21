package Day_10;
import java.util.*;

public class Collection_Sort {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));

        // Sorting the list using Collections.sort()
        Collections.sort(numbers);

        // Printing the sorted list
        System.out.println("Sorted List: " + numbers);
    }
}
