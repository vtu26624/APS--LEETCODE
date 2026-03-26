class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /*
            1. if first of dq is out of current window, remove it.
            2. keep removing elements from the back as long as current element is greater than "back elements".
            3. peekFirst - this will give the maximum at each step. Add it to res.
            4. slide by an index.
            */
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0, n = nums.length, maxNum = Integer.MIN_VALUE;
        int[] res = new int[n - k + 1];
        int idx = 0;
        int front = - 1;

        while(i < n) {
            // check to verify if we have a valid window yet.
            if(i - k + 1 > 0) {
                front = dq.peekFirst();
                if(front <= i - k)
                    dq.removeFirst();
            }
            while(dq.peekLast() != null && nums[dq.peekLast()] < nums[i])
                dq.removeLast();
            dq.addLast(i);
            i++;
            // check to verify if we have a valid window yet.
            if(i - k + 1 > 0)
                res[idx++] = nums[dq.peekFirst()];
        }
        return res;
    }
}