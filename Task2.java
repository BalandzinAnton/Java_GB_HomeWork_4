package HomeWork.HomeWork_4;

//2. Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Task2 {

  public static void main(String[] args) {
    LinkedList<String> listRes = new LinkedList<>();
    listRes = addList();
    enqueue(listRes);
    dequeue(listRes);
    first(listRes);

  }

  private static String first(LinkedList<String> listRes) {
    System.out.println("first() - возвращает первый элемент из очереди, не удаляя");
    String firstElementWithoutDel = listRes.getFirst();
    System.out.printf("First element - " + firstElementWithoutDel + "%n");
    System.out.println(listRes);
    System.out.println();
    return firstElementWithoutDel;
  }

  private static String dequeue(LinkedList<String> listRes) {
    System.out.println("dequeue() - возвращает первый элемент из очереди и удаляет его");
    String firstElement = listRes.getFirst();
    System.out.printf("First element - " + firstElement + "%n");
    listRes.removeFirst();
    System.out.println(listRes);
    System.out.println();
    return firstElement;
  }

  private static void enqueue(LinkedList<String> listRes) {
    System.out.println("enqueue() - помещает элемент в конец очереди");
    listRes.addLast("LAST ELEMENT");
    System.out.println(listRes);
    System.out.println();
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
    System.out.println();
    return list;
  }
}
