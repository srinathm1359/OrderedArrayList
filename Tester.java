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
  }
}
