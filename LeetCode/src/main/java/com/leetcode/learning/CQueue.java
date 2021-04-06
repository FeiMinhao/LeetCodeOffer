package com.leetcode.learning;

import java.util.LinkedList;

public class CQueue {
  private LinkedList<Integer> stackA;
  private LinkedList<Integer> stackB;

  public CQueue() {
    stackA = new LinkedList<Integer>();
    stackB = new LinkedList<Integer>();
  }

  public void appendTail(int value) {
    stackA.push(value);
  }

  public int deleteHead() {
    if (!stackB.isEmpty()) return stackB.removeLast();
    if (stackA.isEmpty()) return -1;
    for(int i = 0; i < stackA.size(); i++){
      stackB.addLast(stackA.removeLast());
    }
    return stackB.removeLast();
  }
}
