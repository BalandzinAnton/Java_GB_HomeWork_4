package HomeWork.HomeWork_4;

import java.util.LinkedList;

//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет "перевернутый" список.
public class Task1 {

  public static void main(String[] args) {
    LinkedList<String> listPhrase = new LinkedList<>();
    listPhrase = addList();
    reverseList(listPhrase);
  }

  private static LinkedList<String> reverseList(LinkedList<String> list) {
    LinkedList<String> listResult = new LinkedList<>();
    int sizeList = list.size();
    for (int i = 0; i < list.size(); i++) {
      listResult.add(i, list.get(sizeList - 1 - i));
    }
    System.out.println(listResult);
    return listResult;
  }

  private static LinkedList<String> addList() {
    String str1 = new String("Hello!");
    String str2 = new String("it's");
    String str3 = new String("my");
    String str4 = new String("new");
    String str5 = new String("LinkedList");
    LinkedList<String> list = new LinkedList<>();
    list.add(str1);
    list.add(str2);
    list.add(str3);
    list.add(str4);
    list.add(str5);
    System.out.println(list);
    return list;
  }
}
