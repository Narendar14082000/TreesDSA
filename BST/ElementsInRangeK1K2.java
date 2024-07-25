import java.util.*;
public class ElementsInRangeK1K2 {

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
       if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<=k2)
        {
            elementsInRangeK1K2(root.left,k1,k2);
            System.out.print(root.data+" ");
            elementsInRangeK1K2(root.right,k1,k2);
        }
        else  if(root.data<k1)
        {
            elementsInRangeK1K2(root.right,k1,k2);
        }
        else  if(root.data>k2)
        {
            elementsInRangeK1K2(root.left,k1,k2);
        }
    }

    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ": ");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftMax = largest(root.left);
        if (leftMax >= root.data) {
            return false;
        }
        int rightMin = minimum(root.right);
        if (rightMin < root.data) {
            return false;
        }
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        return isLeftBST && isRightBST;
    }

    public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }
        IsBSTReturn leftAns = isBST2(root.left);
        IsBSTReturn rightAns = isBST2(root.right);

        int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
        int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
        boolean isBST = true;
        if (leftAns.max >= root.data) {
            isBST = false;
        }
        if (rightAns.min < root.data) {
            isBST = false;
        }
        if (!leftAns.isBST) {
            isBST = false;
        }
        if (!rightAns.isBST) {
            isBST = false;
        }
        return new IsBSTReturn(min, max, isBST);
    }
    
    public static int largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftLargest = largest(root.left);
        int rightLargest = largest(root.right);
        return Math.max(root.data, Math.max(leftLargest, rightLargest));
    }

    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        System.out.println("Detailed Tree:");
        printTreeDetailed(root);

        IsBSTReturn ans = isBST2(root);
        System.out.println("Min: " + ans.min + ", Max: " + ans.max + ", isBST: " + ans.isBST);
        elementsInRangeK1K2(root,2,5);
    }
}