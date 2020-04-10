package com.company.thirty_day_leetcoding_challenge.week2.MinStack;

import java.util.Stack;

public class Solution {

    private int minValue = Integer.MAX_VALUE;
    private Stack<Integer> stack = new Stack();

    public void push(int x) {
        //when Add to Stack if (newValue < minValue) minValue = newValue
        //then add To Stack
        if (stack.isEmpty() || x < minValue) minValue = x;
        stack.push(x);
    }

    public void pop() {
        //first if stack NotEmpty
        //if minValue equals top value delete top value and search for new min value in stack
        if (!stack.isEmpty()) if (minValue == stack.pop()) {
            minValue = Integer.MAX_VALUE;
            stack.forEach(pair -> {
                if (pair < minValue) minValue = pair;
            });
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValue;
    }

    public static void main(String[] args) {

        //Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
        //
        //push(x) -- Push element x onto stack.
        //pop() -- Removes the element on top of the stack.
        //top() -- Get the top element.
        //getMin() -- Retrieve the minimum element in the stack.
        //
        //
        //Example:
        //
        //MinStack minStack = new MinStack();
        //minStack.push(-2);
        //minStack.push(0);
        //minStack.push(-3);
        //minStack.getMin();   --> Returns -3.
        //minStack.pop();
        //minStack.top();      --> Returns 0.
        //minStack.getMin();   --> Returns -2.

        Solution s = new Solution();
        s.push(2147483646);
        s.push(2147483646);
        s.push(2147483647);

        System.out.println(s.top());
        s.pop();
        System.out.println(s.getMin());

        s.pop();
        System.out.println(s.getMin());
        s.pop();

        s.push(2147483647);
        System.out.println(s.top());
        System.out.println(s.getMin());

        s.push(-2147483648);
        System.out.println(s.top());
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        //Output:
        //[2147483647,2147483646,2147483646,2147483646,2147483646,2147483646,2147483646,2147483646]
        //Expected:
        //[2147483647,2147483646,2147483646,2147483647,2147483647,-2147483648,-2147483648,2147483647]
    }
}
