import java.util.ArrayList;
import java.util.Collections;

public class Main {

 public static void main() {

    System.out.println("Задание №1");

    ArrayList colors = new ArrayList<>();

    colors.add("Красный");
    colors.add("Синий");
    colors.add("Зеленый");
    colors.add("Желтый");
    colors.add("Фиолетовый");
    System.out.println("Список цветов " + colors);
    System.out.println();

    System.out.println("Задание №2");

    ArrayList<String> colors2 = new ArrayList<>();
    colors2.add("Red");
    colors2.add("Blue");
    colors2.add("Yellow");
    colors2.add("White");
    colors2.add("Pink");
    colors2.add("Black");

    System.out.println("До обрезки: " + colors2);

    for (int i = 0; i < colors2.size(); i++) {
      String color = colors2.get(i);
      if (color.length() > 3) {
        colors2.set(i, color.substring(0, 3));
      }
    }

    System.out.println("После обрезки: " + colors2);
    System.out.println();

    System.out.println("Задание №3");

    ArrayList colors3 = new ArrayList<>();

    colors3.add("Красный");
    colors3.add("Оранжевый");
    colors3.add("Желтый");
    colors3.add("Зеленый");
    colors3.add("Голубой");
    colors3.add("Синий");
    colors3.add("Розовый");
    colors3.add("Белый");
    colors3.add("Черный");
    colors3.add("Серый");
    colors3.add("Коричневый");

    System.out.println("Список до удаления значений " + colors3);

    //через цикл
    for (int i = colors3.size() - 1; i >= 0; i--) {
      if (i % 2 == 0) {
        colors3.remove(i);
      }
    }

    System.out.println("Список после удаления" + colors3);
    System.out.println();

    System.out.println("Задание №4");

    ArrayList<String> colors4 = new ArrayList<>();
    colors4.add("Red");
    colors4.add("Blue");
    colors4.add("Green");
    colors4.add("Yellow");
    colors4.add("White");

    System.out.println("До замены: " + colors4);

    replaceBlueifNee(colors4);

    System.out.println("После замены: " + colors4);



    System.out.println();

    System.out.println("Задание №5");

    ArrayList colors5 = new ArrayList<>();
    colors5.add("Красный");
    colors5.add("Оранжевый");
    colors5.add("Желтый");
    colors5.add("Зеленый");
    colors5.add("Голубой");
    colors5.add("Синий");
    colors5.add("Фиолетовый");
    colors5.add("Розовый");
    colors5.add("Белый");
    colors5.add("Черный");
    colors5.add("Серый");

    for (int i = 3; i <= 7; i++) {
      System.out.println(colors5.get(i));
    }
    System.out.println();

    System.out.println("Задание №6");

    ArrayList colors6 = new ArrayList<>();
    colors6.add("Green");
    colors6.add("Blue");
    colors6.add("Red");
    colors6.add("Yellow");
    colors6.add("White");

    ArrayList colors7 = new ArrayList<>();
    colors7.add("Black");
    colors7.add("Blue");
    colors7.add("Pink");
    colors7.add("Red");
    colors7.add("Gray");

    ArrayList allColors = new ArrayList<>(colors6);
    allColors.addAll(colors7);

    Collections.sort(allColors);

    System.out.println("Объединенный и отсортированный список:");
    System.out.println(allColors);
    System.out.println();

    System.out.println("Задание 7");

    ArrayList colors8 = new ArrayList<>();
    colors8.add("Red");
    colors8.add("Golden");
    colors8.add("Green");
    colors8.add("Silver");
    colors8.add("White");

    ArrayList colors9 = new ArrayList<>();
    colors9.add("Red");
    colors9.add("Crimson");
    colors9.add("Green");
    colors9.add("Navy");
    colors9.add("White");

    System.out.println("Список 1: " + colors8);
    System.out.println("Список 2: " + colors9);

    boolean lengthCheck = isListSizeEquals(colors8, colors9);
    boolean containsCheck = isBothListHaveSameElements(colors8, colors9);
    boolean orderCheck = isListHaveSameOrder(colors8, colors9);

    if (lengthCheck && containsCheck && orderCheck) {
      System.out.println("Списки совпадают");
    } else {
      System.out.println("Проверки не пройдены:");
      if (!lengthCheck) {
        System.out.println("- Одинаковая длина");
      }
      if (!containsCheck) {
        System.out.println("- Одинаковый набор элементов");
      }
      if (!orderCheck) {
        System.out.println("- Одинаковый порядок элементов");
      }
    }
  }

  //из 4 задания метод
  private static void replaceBlueifNee(ArrayList<String> list) {
    if (list.contains("Blue")) {
      if (list.contains("Black")) {
        System.out.println("Black есть в списке, не делаем замену");
      } else {

        int index = list.indexOf("Blue");
        list.set(index, "Black");

      }
    }
    }

  // Проверка 1: одинаковая длина
  public static boolean isListSizeEquals(ArrayList<String> list1, ArrayList<String> list2) {
    return list1.size() == list2.size();
  }

  // Проверка 2: элементы одного списка есть во втором
  public static boolean isBothListHaveSameElements(ArrayList<String> list1, ArrayList<String> list2) {
    if (!isListSizeEquals(list1, list2)) {
      return false;
    }

    ArrayList<String> copy1 = new ArrayList<>(list1);
    ArrayList<String> copy2 = new ArrayList<>(list2);
    Collections.sort(copy1);
    Collections.sort(copy2);

    return copy1.equals(copy2);
  }

  // Проверка 3: элементы в том же порядке
  public static boolean isListHaveSameOrder(ArrayList<String> list1, ArrayList<String> list2) {
    if (list1.size() != list2.size()) {
      return false;
    }

    for (int i = 0; i < list1.size(); i++) {
      if (!list1.get(i).equals(list2.get(i))) {
        return false;
      }
    }

    return true;


  }
}
