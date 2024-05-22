package solutions;

public class AddTwoLinkedLists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder l1Value = new StringBuilder();
        StringBuilder l2Value = new StringBuilder();
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while(temp1 != null){
            l1Value.append(temp1.val);
            temp1 = temp1.next;
        }

        while(temp2 != null){
            l2Value.append(temp2.val);
            temp2 = temp2.next;
        }

        String num1 = l1Value.reverse().toString();
        String num2 = l2Value.reverse().toString();
        BigInteger sum = new BigInteger(num1).add(new BigInteger(num2));

        String sumStr = new StringBuilder(String.valueOf(sum)).reverse().toString();


        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        for (char c : sumStr.toCharArray()) {
            current.next = new ListNode(c - '0');
            current = current.next;
        }
        return dummyHead.next;
    }
    //Very slow conversion algorithm -_-

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while(l1 != null || l2 != null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0){
            current.next = new ListNode(carry);
        }
        return dummyHead.next;

    }

    //fast solution without using conversion
}
