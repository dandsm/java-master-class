/**
 * Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:

* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers


NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */
public class SharedDigit {
    public static boolean hasSharedDigit(int i1, int i2) {
        
        if (i1 < 10 || i1 > 99 || i2 < 10 || i2 > 99 ) {
            return false;
        }

        int t1 = i1;
        while(t1 > 0) {
            int t2 = i2;
            while(t2 > 0) {
                if (t1%10 == t2%10) {
                    return true;
                }
                t2 /= 10;
            }
            t1 /= 10;
        }

        return false;
    }
}