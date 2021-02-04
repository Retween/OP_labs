package Lab11;

import static java.lang.Math.random;

public class Lab11 {

  public static void show(double[] arr) {
    int k = 0;
    for (double i : arr) {
      String res = String.format("%.3f", i);
      System.out.print("arr[" + k++ + "]=" + res + "  ");
    }
    System.out.println();
  }

  public static double[] initialize(int n) {

    double[] arr = new double[n];

    for (int i = 0; i < n; i++) {
      arr[i] = random() * 100;
    }

    return arr;
  }

  public static void algKnut(double[] arr) {

    int key = 1;
    int j = 0;
    int i = 0;
    double K = 0, R = 0;
    int n = arr.length;

    do {
      if (key == 1) {
        j++;
        key = (j >= n) ? 0 : 2;
      }
      if (key == 2) {
        i = j - 1;
        K = arr[j];
//        R = arr[j];
        key = 3;
      }
      if (key == 3) {
        key = (K >= arr[i]) ? 5 : 4;
      }
      if (key == 4) {
        arr[i + 1] = arr[i];
        i--;
        key = (i >= 0) ? 3 : 5;
      }
      if (key == 5) {
        arr[i + 1] = K;
        key = 1;
      }
    } while (key != 0);
  }

  public static void main(String[] args) {
    double[] arr = initialize(6);

    System.out.println(("Исходный массив arr[]: "));
    show(arr);

    algKnut(arr);

    System.out.println("Отсортированный массив arr[]: ");
    show(arr);
  }
}






