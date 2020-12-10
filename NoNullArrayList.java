public class NoNullArrayList<T> extends ArrayList<T> {
  public boolean add(T element) {
    if (element.equals(null)) {
      throw new IllegalArgumentException("Added element shouldn't be null");
    } else {
      super.add(element);
    }
  }
}
