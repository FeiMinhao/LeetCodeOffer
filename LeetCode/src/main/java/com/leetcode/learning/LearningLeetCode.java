package com.leetcode.learning;


import java.util.ArrayList;
import java.util.Arrays;

public class LearningLeetCode {
  public int singleNumber(int[] nums) {
    Arrays.sort(nums);
    int num = 0;

    for (int i=0; i < nums.length; i = i + 2) {
      if ( i == nums.length - 1) {
        num = nums[i];
      } else {
        if (nums[i] == nums[i+1]) {

        } else {
          num = nums[i];
          break;
        }
      }
    }
    return num;
  }

  public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int k = 0;
    int j = 0;
    int i = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        nums1[k] = nums1[i];
        i++;
        k++;
        j++;
      }
    }
    return Arrays.copyOfRange(nums1, 0, k);
  }

  public boolean findNumberIn2DArray(int[][] matrix, int target) {
    if (matrix.length == 0 || matrix[0].length == 0) return false;
    int rowLength = matrix.length;
    int columnLength = matrix[0].length;
    int searchEndColumn = columnLength;
    int row = 0;
    boolean isFound = false;
    for (int i = 0; i < searchEndColumn; i++) {
      if (row > rowLength - 1) return false;
      if (matrix[row][i] == target) {
        isFound = true;
        break;
      } else if (matrix[row][i] > target) {
        searchEndColumn = i;
        i = -1;
        row++;
      }
      if (i == searchEndColumn - 1) {
        row++;
        i = -1;
      }
    }
    return isFound;
  }

  public String replaceSpace(String s) {
    if (s.length() == 0) return "";
    String[] afterSplit = s.split(" ");
    String replacedText = "";
    int beginSpaces = 0;
    int endSpaces = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        beginSpaces++;
      } else {
        break;
      }
      if (s.charAt(s.length() - i - 1) == ' ') {
        endSpaces++;
      } else {
        break;
      }
    }
    if (afterSplit.length == 0) {
      for (int i = 0; i < s.length(); i++) {
        replacedText = replacedText + "%20";
      }
      return replacedText;
    }

    replacedText = String.join("%20", afterSplit);
    for (int i = 0; i < beginSpaces; i++) {
      replacedText = "%20" + replacedText;
    }
    for (int i = 0; i < endSpaces; i++) {
      replacedText = replacedText + "%20";
    }
    return replacedText;
  }
}
