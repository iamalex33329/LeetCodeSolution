/**
 *  143. Reorder List
 *
 *  You are given the head of a singly linked-list.
 *  The list can be represented as:
 *      L0 -> L1 -> L2 -> ... -> Ln-1 -> Ln
 *  Reorder the list to be on the following form:
 *      L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2
 *
 *  You may not modify the values in the list's nodes.
 *  Only nodes themselves may be changed.
 *
 */

import datastructure.ListNode;

import java.util.ArrayList;

public class Problem143 {

    public void reorderList(ListNode head) {
        ListNode tmp = head, tmp1 = head;

        ArrayList<Integer> list = new ArrayList<>();

        while (tmp != null) {
            list.add(tmp.val);
            tmp = tmp.next;
        }

        int l=0, r=list.size()-1;

        for (int i=0; i<list.size(); i++) {
            if (i % 2 == 0) { tmp1.val = list.get(l++); }
            else { tmp1.val = list.get(r--); }
            tmp1 = tmp1.next;
        }
    }
}
