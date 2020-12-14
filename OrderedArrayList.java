import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  private int findIndex(T element) {
    for (int i = 0; i < super.size(); i++) {
      if (element.compareTo(super.get(i)) < 0) {
        return i;
      }
    }
    return super.size();
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Added element shouldn't be null");
    } else {
      super.add(findIndex(element), element);
      return true;
    }
  }

}
