package WeekOfMay8;

/* 2) Merge Sorted Lists
        You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
        Merge all the linked-lists into one sorted linked-list and return it.

        Example1:
        Input: lists = [[1,4,5],[1,3,4],[2,6]]
        Output:[1,1,2,3,4,4,5,6]
        Explanation: The linked-lists are:
        [
        1->4->5,
        1->3->4,
        2->6
        ]
        merging them into one sorted list:
        1->1->2->3->4->4->5->6

        Example2:
        Input: lists= []
        Output: []

        Example3:
        Input: lists = [[]]
        Output: []

        Constraints:
        k == lists.length
        0 <= k <= 104
        0 <= lists[i].length <= 500
        -104 <= lists[i][j] <= 104
        lists[i] is sorted in ascending order.
        The sum of lists[i].length will not exceed 104.

 */

import java.util.*;

public class MergeSortedLists {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(4);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(4);

        LinkedList<Integer> list3 = new LinkedList<>();
        list1.add(2);
        list1.add(6);

        LinkedList<LinkedList<Integer>> addLists = new LinkedList<>();
        addLists.add(list1);
        addLists.add(list2);
        addLists.add(list3);

        LinkedList<Integer> mergedList = mergedSortedList(addLists);

        System.out.println(mergedList);

    }

    public static LinkedList<Integer> mergedSortedList(LinkedList<LinkedList<Integer>> addLists){

        LinkedList<Integer> mergedList = new LinkedList<>();

        for (LinkedList<Integer> list : addLists) {
            mergedList.addAll(list);
        }

        mergedList.sort(null);

        return mergedList;
    }
}
