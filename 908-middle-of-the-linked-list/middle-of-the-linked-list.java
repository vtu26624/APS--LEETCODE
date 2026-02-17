class Solution {
    public ListNode middleNode(ListNode head) {
        int i = 0;
        ListNode node = head;
        
        // Pass 1: Count the total number of nodes
        while(node != null){
            node = node.next;
            i++;
        }
        
        // Reset to head and calculate middle index
        node = head;
        i = i / 2;
        
        // Pass 2: Move to the middle index
        while(i > 0){
            node = node.next;
            i--;
        }
        
        return node;
    }
}