import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lab8 {


  public static int[][] multiMatrix(int[][] matrix1, int[][] matrix2) {

    try {
      if (matrix1.length != matrix2[0].length) {
        throw new Exception();
      }
    } catch (Exception e) {
      System.out.println("Неверные размеры");
      System.exit(0);
    }

    int N = matrix1.length;
    int M = matrix2[0].length;

    int[][] result = new int[N][M];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        for (int k = 0; k < matrix1[0].length; k++) {
          result[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }

    return result;
  }


  public static int[] multiMatrix(int[][] matrix, int[] vector) {

    try {
      if (matrix[0].length != vector.length) {
        throw new Exception();
      }
    } catch (Exception e) {
      System.out.println("Неверные размеры");
      System.exit(0);
    }
    int N = matrix.length;
    int M = matrix[0].length;

    int[] result = new int[N];

    for (int i = 0; i < N; i++) {
      for (int k = 0; k < M; k++) {
        result[i] += matrix[i][k] * vector[k];
      }
    }

    return result;


  }

  public static int[] multiMatrix(int[] vector, int[][] matrix) {
    try {
      if (matrix[0].length != vector.length) {
        throw new Exception();
      }
    } catch (Exception e) {
      System.out.println("Неверные размеры");
      System.exit(0);
    }

    int N = matrix.length;
    int M = matrix[0].length;

    int[] result = new int[M];

    for (int i = 0; i < M; i++) {
      for (int k = 0; k < N; k++) {
        result[i] += vector[k] * matrix[k][i];
      }
    }

    return result;
  }


  public static void main(String[] args) throws Exception {

    int[][] matrix1 = new int[3][2];
    int[][] matrix2 = new int[2][3];
    int[] vect = new int[4];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Первая матрица");
    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix1[0].length; j++) {
        matrix1[i][j] = Integer.parseInt(br.readLine());
      }
    }
    System.out.println("Вторая матрица");
    for (int i = 0; i < matrix2.length; i++) {
      for (int j = 0; j < matrix2[0].length; j++) {
        matrix2[i][j] = Integer.parseInt(br.readLine());
      }
    }

//    for (int i = 0; i < vect.length; i++) {
//      vect[i] = Integer.parseInt(br.readLine());
//    }

    System.out.println(Arrays.deepToString(matrix1));
    System.out.println(Arrays.deepToString(matrix2));
//    System.out.println(Arrays.toString(vect));

    int[][] result = multiMatrix(matrix1, matrix2);
    for (int[] v : result) {
      for (int x : v) {
        System.out.print(x + " ");
      }
      System.out.println();
    }

//    int[] result = multiMatrix(matrix1, vect);
//    System.out.println(Arrays.toString(result));

    ////////////////////


    /*for (int i = 0, k = 1;
        i < matrix1.length;
        i++) {
      for (int j = 0; j < matrix1[0].length; j++) {
        matrix1[i][j] = k++;
      }
    }
    for (int i = 0, k = 8;
        i < matrix2.length;
        i++) {
      for (int j = 0; j < matrix2[0].length; j++) {
        matrix2[i][j] = k++;
      }
    }
    System.out.println(Arrays.deepToString(matrix1));
    System.out.println(Arrays.deepToString(matrix2));

    int[][] result = multiMatrix(matrix1, matrix2);
    for (int[] v : result) {
      for (int x : v) {
        System.out.print(x + " ");
      }
      System.out.println();
    }
*/

  }
}
