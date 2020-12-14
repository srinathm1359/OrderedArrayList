import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    //Taking care of the null case
    if (element == null) {
      throw new IllegalArgumentException("Element null not allowed.");
    }
    //Taking care of the empty list case
    if (this.size() == 0) {
      super.add(0, element);
      return true;
    }
    //Finding the right index
    int addAt = 0;
    T current = this.get(addAt);
    while (addAt < this.size()) {
      current = this.get(addAt);
      if (element.compareTo(current) <= 0) {
        super.add(addAt, element);
        return true;
      }
      addAt++;
    }
    //Finish adding
    super.add(addAt, element);
    return true;
  }

  public void add(int index, T element) {
    this.add(element);
  }
 }
