import java.util.Arrays;

public class Lab10 {

  public static void main(String[] args) {
    int[][] arr = new int[5][4];

    for (int i = 0, k = 1; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = k++;
      }
    }
    System.out.println(Arrays.deepToString(arr));

    int[] x = new int[5];

    for (int i : x) {
      System.out.println(Arrays.toString(arr[i]));
    }


  }
}
