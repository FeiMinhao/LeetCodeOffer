package com.leetcode.learning;

import java.util.HashMap;
import com.leetcode.learning.TreeNode;
import java.util.Map;


public class BinaryTree {
  private Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
  private int[] preorder;

  public TreeNode buildTreeNode (int[] preorder, int[] inorder) {
    this.preorder = preorder;
    for(int i = 0; i < inorder.length; i++)
      indexMap.put(inorder[i], i);
    return rebuildNode(0, 0, inorder.length - 1);

  }

  public TreeNode rebuildNode (int root, int left, int right) {
      if(left > right) return null;                          // 递归终止
      TreeNode node = new TreeNode(this.preorder[root]);          // 建立根节点
      int i = indexMap.get(preorder[root]);                       // 划分根节点、左子树、右子树
      node.left = rebuildNode(root + 1, left, i - 1);              // 开启左子树递归
      node.right = rebuildNode(root + i - left + 1, i + 1, right); // 开启右子树递归
      return node;                                           // 回溯返回根节点
  }
}
