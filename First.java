import java.util.ArrayList;

public class First {

    public static void Even_Removal(ArrayList<Integer> list) {
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j)%2 == 0) {
                list.remove(j);
            }
        }
        System.out.println("no evens: " + list.toString());
    }

    public static void Max_Find(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) > max) {
                max = list.get(j);
            }
        }
        System.out.println("max = " + max);
    }

    public static void Min_Find(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) < min) {
                min = list.get(j);
            }
        }
        System.out.println("min = " + min);
    }

    public static void Avg(ArrayList<Integer> list) {
        double avg = list.stream().mapToInt(a -> a).average().orElse(0);
        System.out.println("average = " + avg);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        Even_Removal(list);
        Max_Find(list);
        Min_Find(list);
        Avg(list);

    }
}