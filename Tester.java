public class Tester {
  public static void main(String[]args) {
    NoNullArrayList<String> hello = new NoNullArrayList<String>();
    System.out.println(hello.add(null));
    System.out.println(hello.add("hi"));
  }
}
