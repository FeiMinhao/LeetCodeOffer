import org.junit.Assert;
import org.junit.Before;
import com.leetcode.learning.BinaryTree;
import com.leetcode.learning.TreeNode;
import org.junit.Test;

public class BinaryTreeTest {
  private BinaryTree binaryTreeTest;
  @Before
  public void init(){
    binaryTreeTest = new BinaryTree();
  }

  @Test
  public void RebuildTreeNodeTest () {
    int[] preorder = {3, 9, 2, 15, 7};
    int[] inorder = {9, 3, 15, 2, 7};
    TreeNode node = binaryTreeTest.buildTreeNode(preorder, inorder);
    Assert.assertEquals(1, 1);
  }
}
