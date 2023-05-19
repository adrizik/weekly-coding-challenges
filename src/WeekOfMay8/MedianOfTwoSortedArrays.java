package WeekOfMay8;

/*        1) Median of Two Sorted Arrays
        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n)).

        Example1:
        Input:nums1 = [1,3], nums2 = [2]
        Output:2.00000
        Explanation: merged array = [1,2,3] and median is 2.

        Example2:
        Input:nums1 = [1,2], nums2 = [3,4]
        Output:2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

        Constraints:
        nums1.length == m
        nums2.length == n

        0 <= m <= 1000
        0 <= n <= 1000
        1 <= m + n <= 2000
        -106 <= nums1[i], nums2[i] <= 106
 */


import java.util.ArrayList;
import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        int[] nums3 = {1,2};
        int[] nums4 = {3,4};

        System.out.println(findMedian(nums1, nums2));
        System.out.println(findMedian(nums3, nums4));
    }

    public static double findMedian(int[] nums1, int[] nums2){

        // create a new array with the size of nums1 and nums2 to fit all numbers later
        int[] arrays = new int[nums1.length + nums2.length];

        // i keeps track of the index of the new array
        int i = 0;
        // j keeps track of the index of nums1
        int j = 0;
        // k keeps track of the index of nums2
        int k = 0;

        // iterate through the new array and add all numbers from nums1 and nums2
        for (i = 0; i < arrays.length ; i++){
            if(i < nums1.length) {
                // add the numbers of nums1 as long as i is less than its length
                arrays[i] = nums1[j];
                j++;
            } else {
                // else add the numbers from nums2
                arrays[i] = nums2[k];
                k++;
            }
        }

        // sort the array!
        Arrays.sort(arrays);

        // find the middle index by dividing the length by 2
        int middle = arrays.length / 2;

        // hold the median value
        double median;

        // check if the remainder is even by using the modulo operator
        if(arrays.length % 2 == 0) {

            // if its even calculate the median by taking the avg of the two middle numbers
            median = (arrays[middle - 1] + arrays[middle]) / 2.0;
        } else {

            // if its odd, take the middle value
            median = arrays[middle];
        }

        return median;
    }
}