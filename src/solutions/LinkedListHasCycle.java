package solutions;

public class LinkedListHasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        Set<ListNode> seen = new HashSet<>();

        if(current == null || current.next == null) {
            return false;
        }

        while(current != null){
            if (seen.contains(current)){
                return true;
            }
            seen.add(current);
            current = current.next;
        }
        return false;
    }

    //Slow solution using HashSet

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;


        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }
    //fast solution using two pointers
}
