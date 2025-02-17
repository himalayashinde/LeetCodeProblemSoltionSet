// public class AddTwoNumbers {
    
// }

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify result list
        ListNode current = dummy; // Pointer to construct the new list
        int carry = 0; // Initialize carry

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0; // Get value from l1 or 0
            int val2 = (l2 != null) ? l2.val : 0; // Get value from l2 or 0
            int sum = val1 + val2 + carry; // Calculate sum with carry
            carry = sum / 10; // Update carry for next iteration
            current.next = new ListNode(sum % 10); // Store single digit
            current = current.next; // Move forward

            // Move to next nodes if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; // Return the result list (excluding dummy)
    }

    // Helper function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    // Helper function to create a linked list from an array
    public static ListNode createLinkedList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Main method to execute the solution
    public static void main(String[] args) {
        // Create linked lists from arrays
        ListNode l1 = createLinkedList(new int[]{2, 4, 3});
        ListNode l2 = createLinkedList(new int[]{5, 6, 4});

        System.out.print("Input List 1: ");
        printList(l1);
        System.out.print("Input List 2: ");
        printList(l2);

        // Perform addition
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print result
        System.out.print("Output List: ");
        printList(result);
    }
}
