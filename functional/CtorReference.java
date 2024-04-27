// functional/CtorReference.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

class Dog {
  String name;
  int age = -1; // For "unknown"
  Dog() {
    System.out.println("0");
    name = "stray";
  }
  Dog(String nm) {
    System.out.println("1");name = nm; }
  Dog(String nm, int yrs) {
    System.out.println("2");nm = nm; age = yrs; }
}

interface MakeNoArgs {
  Dog make();
}

interface Make1Arg {
  Dog make(String nm);
}

interface Make2Args {
  Dog make(String nm, int age);
}

public class CtorReference {
  public static void main(String[] args) {
    MakeNoArgs mna = Dog::new;        // [1]
    Make1Arg m1a = Dog::new;          // [2]
    Make2Args m2a = Dog::new;         // [3]


//    System.out::println;
    Dog dn = mna.make();
    Dog d1 = m1a.make("Comet");
    Dog d2 = m2a.make("Ralph", 4);
  }
}
