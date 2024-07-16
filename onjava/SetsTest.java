import java.util.HashSet;
import java.util.Set;

public class SetsTest {
    public static void main(String[] args) {
        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(1);
        integerSet1.add(2);
        integerSet1.add(3);

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(3);
        integerSet2.add(4);
        integerSet2.add(5);

        Set<Integer> union = Sets.union(integerSet1, integerSet2);
        Set<Integer> intersection = Sets.intersection(integerSet1, integerSet2);
        Set<Integer> difference = Sets.difference(integerSet1, integerSet2);
        Set<Integer> complement = Sets.complement(integerSet1, integerSet2);

        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);
        System.out.println(complement);
    }
}
/* Output:
[1, 2, 3, 4, 5]
[3]
[1, 2]
[1, 2, 4, 5]
*/
