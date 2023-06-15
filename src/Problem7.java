/**
 *  7. Reverse Integer
 *
 *  Given a signed 32-bit integer x, return x with its digits reversed.
 *  If reversing x causes the value to go outside the signed 32-bit integer
 *  range [-231, 231 - 1], then return 0.
 *
 *  Assume the environment does not allow you to store 64-bit integers
 *  (signed or unsigned).
 *
 */

public class Problem7 {

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        }
        return (int) result;
    }
}
