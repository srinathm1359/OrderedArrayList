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
      throw new IllegalArgumentException("Element null not allowed.");
    }
    return super.add(element);
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Element null not allowed.");
    }
    super.add(index, element);
  }
}
