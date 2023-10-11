import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list = new ArrayList<>(array);
        Collections.shuffle(list);
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.print("Shuffled array: ");
        for (Integer element : shuffledArray) {
            System.out.print(element + " ");
        }
    }
}
