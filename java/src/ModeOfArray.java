import java.util.HashMap;

public class ModeOfArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 2, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int mode = arr[0];
        int maxFrequency = 0;

        // Find highest frequency
        for (int key : map.keySet()) {

            if (map.get(key) > maxFrequency) {
                maxFrequency = map.get(key);
                mode = key;
            }
        }

        System.out.println("Mode = " + mode);
        System.out.println("Frequency = " + maxFrequency);
    }
}