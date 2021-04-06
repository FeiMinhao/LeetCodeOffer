package com.leetcode.learning;

public class Fib {
  public int fin (int n) {
    int nextsum = 0;
    int lastsum = 0;
    int currentsum = 1;
    for (int i = 0; i < n; i++) {
      lastsum = nextsum;
      nextsum = lastsum + currentsum;
      currentsum = nextsum;
    }

    return nextsum;
  }
}
