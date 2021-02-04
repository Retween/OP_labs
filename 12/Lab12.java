import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Lab12 {


  Data[] data = new Data[11];
  int[] arr = new int[10000];
  int i = 1;

  static class Data {

    int article;
    String name;
    double cost;
    int num;
    String description;

    public Data(int article, String name, double cost, int num, String description) {
      this.article = article;
      this.name = name;
      this.cost = cost;
      this.num = num;
      this.description = description;
    }

    @Override
    public String toString() {
      return "    Data{" +
          "article=" + article +
          ", name='" + name + '\'' +
          ", cost=" + cost +
          ", num=" + num +
          ", description='" + description + '\'' +
          '}';
    }
  }


  public void initialize() {
    try (Scanner scanner = new Scanner(new FileInputStream(
        "C:\\Users\\erne_\\Documents\\Учеба\\5 семестр\\Технология программирования\\Лабы\\12\\Data.txt"))) {
      while (scanner.hasNext()) {
        int x = Integer.parseInt(scanner.next());
        arr[x] = i;
        data[i++] = new Data(x, scanner.next(), Double.parseDouble(scanner.next()),
            Integer.parseInt(scanner.next()), scanner.next());
      }

    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    }
  }

  public void search() {
    String str;
    int article;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//      System.out.println((Arrays.toString(arr)));
//      System.out.println((Arrays.toString(data)));

      System.out.println("Введите артикул: ");
      System.out.println(arr[1111]);
      while ((str = (br.readLine())) != null && !str.equals("")) {
        article = Integer.parseInt(str);
        if (arr[article] == 0) {
          System.out.println("Нет такого элемента");
        }
//        System.out.println(article);
//        for (int j = 0; j < arr.length; j++) {
//          if (article == arr[j]) {
//            System.out.println(data[j]);
//          }
//        }
        else {
          System.out.println(data[arr[article]]);
        }
      }
    } catch (Exception e) {
      System.out.println("Ошибка чтения");
    }
  }

  public static void main(String[] args) {

    Lab12 test = new Lab12();
    test.initialize();
    test.search();

  }
}

