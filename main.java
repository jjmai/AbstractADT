public class main {

  public static void main(String[] args) {
    LL list = new LL();
    list.insert(4);
    list.insert(41);
    list.insert(3);
    list.insert(0);
    list.insert(18);
    if (list.Search(0) != null) {
      System.out.println("yy");
    }
    list.delete(0);

    list.insertPointer(2);
    list.insertAfter(99);

    list.printList();
  }
}
