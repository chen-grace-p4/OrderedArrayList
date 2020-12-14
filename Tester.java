public class Tester {
  public static void main(String[]args) {
    // NoNullArrayList<String> hello = new NoNullArrayList<String>();
    // NoNullArrayList<String> hello2 = new NoNullArrayList<String>(10);
    // // System.out.println(hello.add(null));
    // System.out.println(hello.add("hi"));
    //
    // // hello.add(1, null);
    // hello.add(1, "hi");
    // System.out.println(hello);
    //
    // System.out.println(hello.set(0, "bye"));
    // // hello.set(1, null);
    //
    // System.out.println(hello);
    // hello.add("hi");
    // hello.add("bye");
    // hello.add("boo");
    // hello.add(3, "woah");
    // System.out.println(hello);

    OrderedArrayList<Integer> hello = new OrderedArrayList<Integer>();
    hello.add(1);
    hello.add(2);
    hello.add(4);
    System.out.println(hello);
    hello.add(3);
    System.out.println(hello);
    hello.add(-5);
    hello.add(100);
    System.out.println(hello);
    hello.add(null);
  }
}
