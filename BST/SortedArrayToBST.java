import java.util.LinkedList;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SortedArrayToBST {

   
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return convertToBST(nums, 0, nums.length - 1);
    }

   
    private TreeNode convertToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

       
        int mid = left + (right - left) / 2;

     
        TreeNode node = new TreeNode(nums[mid]);

        
        node.left = convertToBST(nums, left, mid - 1);

        
        node.right = convertToBST(nums, mid + 1, right);

        return node;
    }

    
    public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        SortedArrayToBST converter = new SortedArrayToBST();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        TreeNode root = converter.sortedArrayToBST(nums);
        System.out.print("Level-wise order of the constructed BST: ");
        converter.levelOrderTraversal(root);  
    }
}
