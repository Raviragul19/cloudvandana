public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(array);

        // Print the shuffled array
        System.out.print("Shuffled array: ");
        for (Integer element : array) {
            System.out.print(element + " ");
        }
    }

    public static void shuffleArray(Integer[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            // Swap array[i] and array[j]
            Integer temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

