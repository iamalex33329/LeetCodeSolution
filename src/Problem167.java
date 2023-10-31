import java.util.HashMap;

/**
 *  167. Two Sum II - Input Array Is Sorted
 *
 *  Given a 1-indexed array of integers numbers that is already sorted
 *  in non-decreasing order, find two numbers such that they add up to
 *  a specific target number. Let these two numbers be numbers[index1]
 *  and numbers[index2] where 1 <= index1 < index2 < numbers.length.
 *
 *  Return the indices of the two numbers, index1 and index2, added by
 *  one as an integer array [index1, index2] of length 2.
 *
 *  The tests are generated such that there is exactly one solution.
 *  You may not use the same element twice.
 *
 *  Your solution must use only constant extra space.
 *
 */

public class Problem167 {

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i+1};
            }
            map.put(numbers[i], i+1);
        }
        return null;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int l= 0;
        int r = numbers.length-1;

        while (l < r) {
            if (numbers[l] + numbers[r] < target) {
                l++;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                System.gc();
                return new int[] {l+1, r+1};
            }
        }
        return new int[] {};
    }
}