import java.util.ArrayList;
import java.util.Arrays;

public class ekz {

  public static int[] bubbleSort(int[] array) {
    int[] result = new int[array.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = array[i];
    }

    boolean sorted = false;
    int temp;

    while (!sorted) {
      sorted = true;
      for (int i = 0; i < result.length - 1; i++) {
        if (result[i] > result[i + 1]) {
          temp = result[i];
          result[i] = result[i + 1];
          result[i + 1] = temp;
          sorted = false;
        }
      }
    }
    return result;
  }

  public static Integer[] mySort(int[] array) {
    ArrayList<Integer> result = new ArrayList<>();
    result.add(array[0]);

    for (int i = 1; i < array.length; i++) {
      if (array[i] > result.get(result.size() - 1)) {
        result.add(array[i]);
      }
    }

    return result.toArray(new Integer[result.size()]);
  }

  public static int findMaxSeries(int[] arr) {
    int max = 0;
    int k = 0;

    for (int j : arr) {
      if (j == 0) {
        k++;
      } else if (k > max) {
        max = k;
        k = 0;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 0, 0, 0, 0, 6, 3, 19, 20, 42, 0, 7, 33, 0};

    System.out.println("Неотсортированный массив:");
    System.out.println(Arrays.toString(arr));
    System.out.println("Полученный массив:");
    System.out.println(Arrays.toString(mySort(arr)));
    System.out.println("Наибольшая последовательность нулей в исходном массиве:");
    System.out.println(findMaxSeries(arr));
  }
}
