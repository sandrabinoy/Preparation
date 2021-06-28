package practice;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        StringBuffer num1 = new StringBuffer();
        StringBuffer num2 = new StringBuffer();

        while(l1.next != null || l2.next != null) {
            num1.append(l1.val);
            l1 = l1.next;
            num2.append(l2.val);
            l2 = l2.next;
        }

        num1.reverse();
        num2.reverse();
        int number1 = Integer.parseInt(num1.toString());
        int number2 = Integer.parseInt(num2.toString());
        int resultant = number1 + number2;

        int n = num1.length() > num2.length() ? num1.length() : num2.length();

        for(int i = 0; i < n; i++) {

            result.val = resultant;
            result = result.next;

        }

            return result;

    }

}

class ListNode {

    int val;
    ListNode next;
    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

}
