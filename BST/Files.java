    
//Number Of Leaves in BT 
    public static int numLeaves(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.left==null &&root.right==null){
            return 1;
        }
        return numLeaves(root.left)+numLeaves(root.right);
}

System.out.println(numLeaves(root));


//Print the Nodes at Depth K  in BT
    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    }

System.out.println(printAtDepthK(root,2));

﻿
// printing the depths of the trees  in BT
private static void changeToDepthTreeHelper(BinaryTreeNode<Integer> root, int level) { 
  if (root == null) {
return;
}
}
root.data = level;
changeToDepth TreeHelper(root.left, level + 1);
changeToDepth TreeHelper(root.right, level + 1);
public static void changeToDepth Tree (BinaryTreeNode<Integer> root) {
changeToDepthTreeHelper(root, 0);
}
System.out.println(changeToDepth(root));

=========================================================================
//Is Node Present or Not in BT
public static boolean isNodePresent (BinaryTreeNode<Integer> root, int x) { 
  if (root == null) {
    return false;
}


if (root.data.equals(x)) {
}
return true;
return (isNodePresent (root.left, x) || isNodePresent(root.right, x));

}

=======================================================================

//Print the Nodes Without Siblings 
public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
    //Your code goes here
    if(root == null)
        {
            return;
        }
        
        if(root.left==null && root.right!=null)
        {
            System.out.print(root.right.data+" ");
            
        }
        
        if(root.left!=null && root.right==null)
        {
            System.out.print(root.left.data+" ");
           
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
  }

=========================================================================


=========================================================================
//Elements Between K1 and K2

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

=================================================================


//Construct the BST Using Sorted Array
public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
       if(arr.length==0)
        {
            return  null;
        }
        int mid;
        if(n%2!=0)
        {
            mid = n/2;
        }
        else
        {
            mid = (n/2) -1;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        int left[] = new int[mid];
        for(int i =0;i<mid;i++)
        {
            left[i]=arr[i];
        }

        int right[]=new int[arr.length-mid-1];
        for(int i =mid+1;i<arr.length;i++)
        {
            right[i-(mid+1)] = arr[i];
        }


        root.left=SortedArrayToBST(left, left.length);
        root.right=SortedArrayToBST(right, right.length);

        return root;
    }

============================================================
public static int largest(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    }

    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
      if(root==null) {
          return null;
          }
      if(root.left==null && root.right==null) {
          return null;
          }
      root.left = removeLeaves(root.left);
      root.right = removeLeaves(root.right);
      return root;
      }

      public static int height(root) {
        if(root==null) {
          return 0;
          }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);
      }

      //bad time complexity Worst case:- O(n2), avg case:- O(nlogn)
      public static boolean isBalanced(BinaryTreeNode<Integer> root) {
          if(root==null) {
              return true;
            }
          int leftHeight=height(root.left);
          int rightHeight=height(root.right);
          if(Math.abs(leftHeight - rightHeight) >1){
              return false;
              }
          boolean isLeftBalanced = isBalanced(root.left);
          boolean isRightBalanced = isBalanced(root.right);
          return isLeftBalanced && isRightBalanced ;
          }
  //Better time complexity O(n).
      public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
          if(root==null){
            int height= 0;
            boolean isBal= true;
            BalancedTreeReturn ans= new BalancedTreeReturn();
            ans.height= height;
            ans.isBalanced= isBal;
            return ans;
          }
          BalancedTreeReturn leftOutput= isBalancedBetter(root.left);
          BalancedTreeReturn rightOutput= isBalancedBetter(root.right);
          boolean isBal= true;
          int height= 1+Math.max(leftOutput.height, rightOutput.height)

          if(Math.abs(leftOutput.height-rightOutput.height)>1){
            isBal= false;
          }
          if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal=false;
          }
          BalancedTreeReturn ans= new BalancedTreeReturn()
          ans.height= height;
          ans.isBalanced= isBal;
          return ans;
      }

       public static BinaryTreeNode<Integer> takeinputLevelWise(){
          Scanner s= new Scanner(System.in);
          int rootData= s.nextInt();

          if(rootData==-1) return null;

          BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
          Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
          pendingChildren.add(root);

          while(!pendingChildren.isEmpty()){
              BinaryTreeNode<Integer> front= pendingChildren.poll();
              System.out.println("Enter left child of "+ front.data);
              int left= s.nextInt();
              if(left!=-1){
                      BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
                      front.left= leftChild;
                      pendingChildren.add(leftChild)
              }

              System.out.println("Enter right child of "+ front.data);
              int right= s.nextInt();
              if(right!=-1){
                      BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
                      front.right= rightChild;
                      pendingChildren.add(rightChild)
              }
          }
          return root;
      }

       public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2){
          if(root==null){
              return;
          }
          if(root.data<k1){
              printBetweenK1K2(root.right, k1, k2);
          }else if(root.data>k2){
              printBetweenK1K2(root.left, k1, k2);
          }else{
              System.out.println(root.data);
              printBetweenK1K2(root.left,k1,k2);
              printBetweenK1K2(root.right, k1,k2);
          }
      }

    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }