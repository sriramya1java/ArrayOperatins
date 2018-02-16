import java.util.ArrayList;

public class B {
    public static void printOnlyInFirst(int array1[], int array2[]) {
        int j;
        boolean contains = true;
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (int i = 0; i < array1.length; i++) {
            for (j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                results.add(array1[i]);
            } else {
                contains = false;
            }
        }
        System.out.println(results);
    }
}

