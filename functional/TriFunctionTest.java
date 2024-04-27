// functional/TriFunctionTest.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class TriFunctionTest {
  static int f(int i, long l, double d) { return 99; }

  static long f(int i,int j,int k,int l) {
    return (long) i +j +k+l;
  }
  public static void main(String[] args) {
    TriFunction<Integer, Long, Double, Integer> tf =
      TriFunctionTest::f;
    tf = (i, l, d) -> 12;
    MyTriFunction<Integer,Integer,Integer,Integer,Long> mtf = TriFunctionTest::f;

//    mtf = (i,j,k,l) -> 100L;
    Long apply = mtf.apply(1, 2, 4, 5);
    System.out.println(apply);
  }
}
