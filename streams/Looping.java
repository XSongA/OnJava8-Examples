// streams/Looping.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
//import static onjava.Repeat.*;

import static java.util.stream.IntStream.range;

public class Looping {
  static void hi() { System.out.println("Hi!"); }
  public static void main(String[] args) {
    repeat(3, () -> System.out.println("Looping!"));
    repeat(2, Looping::hi);
  }

  public static void repeat(int n, Runnable action) {
    range(0, n).forEach(i -> action.run());
  }
}
/* Output:
Looping!
Looping!
Looping!
Hi!
Hi!
*/
