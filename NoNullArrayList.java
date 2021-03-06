import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Added element shouldn't be null");
    } else {
      return super.add(element);
    }
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Added element shouldn't be null");
    } else {
      super.add(index, element);
    }
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Element to be set shouldn't be null");
    } else {
      return super.set(index, element);
    }
  }

}
