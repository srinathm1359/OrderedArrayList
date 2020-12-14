public class Tester {
  public static void main(String[] args) {
    //Testing NoNullArrayList default constructor
    NoNullArrayList<Integer> nonull1 = new NoNullArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      nonull1.add(i);
    }
    System.out.println(nonull1);
    /*Testing NoNullArrayList add()
    nonull1.add(null);
    */
    /*Testing NoNullArrayList add(int index, T element)
    nonull1.add(3, null);
    */
    for (int i = 0; i < 3; i++) {
      nonull1.add(3, 20);
    }
    System.out.println(nonull1);
    //Testing NoNullArrayList set()
    int current = nonull1.get(0);
    for (int i = 0; i < 13; i++) {
      current = nonull1.get(i);
      nonull1.set(i , 2*current);
    }
    System.out.println(nonull1);
    /*
    nonull1.set(3, null);
    */
    //Testing OrderedArrayList add()
    OrderedArrayList<Integer> ordered = new OrderedArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      ordered.add(i);
    }
    for (int i = 0; i < 10; i++) {
      ordered.add(15 - i);
    }
    System.out.println(ordered);
    //Testing OrderedArrayList add(index)
    for (int i = 0; i < 3; i++) {
      ordered.add(3, 20);
    }
    System.out.println(ordered);
    //Testing OrderedArrayList set()
    ordered.set(10, -40); System.out.println(ordered);
  }
}
