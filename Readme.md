# ============== Trees =================

## Introduction to Binary Trees (BT) and Binary Search Trees (BST)

### Binary Tree (BT)
A Binary Tree is a hierarchical data structure in which each node has at most two children, referred to as the left child and the right child. A Binary Tree has several applications including expression trees, Huffman coding trees, and more.

**Properties of a Binary Tree:**
- The maximum number of nodes at level `l` is `2^l`.
- The maximum number of nodes in a binary tree of height `h` is `2^(h+1) - 1`.
- In a Binary Tree with `n` nodes, the minimum possible height or the minimum number of levels is `⌈log2(n + 1)⌉`.

### Binary Search Tree (BST)
A Binary Search Tree is a binary tree with the following additional properties:
- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- The left and right subtrees must also be binary search trees.

BSTs are used to implement efficient searching and sorting algorithms.

**Properties of a Binary Search Tree:**
- In-order traversal of a BST gives a sorted sequence of keys.
- Searching, insertion, and deletion operations have an average time complexity of O(log n).

## Multiple-Choice Questions (MCQs)

1. **What is the maximum number of nodes at level `l` in a binary tree?**
   - a) `2^l`
   - b) `2^(l+1)`
   - c) `2^(l-1)`
   - d) `l^2`

   **Answer: a) `2^l`**

2. **What is the height of a binary tree with `n` nodes?**
   - a) `⌈log2(n + 1)⌉`
   - b) `⌈log2(n)⌉`
   - c) `n`
   - d) `n - 1`

   **Answer: a) `⌈log2(n + 1)⌉`**

3. **In a binary search tree, which traversal yields the nodes in ascending order?**
   - a) Pre-order
   - b) In-order
   - c) Post-order
   - d) Level-order

   **Answer: b) In-order**

4. **What is the worst-case time complexity for searching in a binary search tree?**
   - a) O(1)
   - b) O(n)
   - c) O(log n)
   - d) O(n log n)

   **Answer: b) O(n)**

5. **Which of the following is true for a binary search tree?**
   - a) All nodes have two children.
   - b) Left child nodes are greater than the parent node.
   - c) Right child nodes are less than the parent node.
   - d) In-order traversal produces a sorted sequence.

   **Answer: d) In-order traversal produces a sorted sequence.**

6. **What is the minimum number of nodes in a binary tree of height `h`?**
   - a) `h`
   - b) `h + 1`
   - c) `2^(h+1) - 1`
   - d) `h(h + 1)/2`

   **Answer: b) `h + 1`**

7. **Which of the following is not a type of binary tree?**
   - a) Full binary tree
   - b) Complete binary tree
   - c) Perfect binary tree
   - d) Incomplete binary tree

   **Answer: d) Incomplete binary tree**

8. **What is the time complexity of inserting an element into a binary search tree?**
   - a) O(1)
   - b) O(n)
   - c) O(log n)
   - d) O(n log n)

   **Answer: c) O(log n)**

9. **Which traversal method uses a queue data structure?**
   - a) Pre-order
   - b) In-order
   - c) Post-order
   - d) Level-order

   **Answer: d) Level-order**

10. **In a binary search tree, if a node has two children, its inorder successor is:**
    - a) The maximum value in its left subtree
    - b) The minimum value in its left subtree
    - c) The maximum value in its right subtree
    - d) The minimum value in its right subtree

    **Answer: d) The minimum value in its right subtree**

11. **What is the height of a binary search tree with 7 nodes in the worst case?**
    - a) 2
    - b) 3
    - c) 6
    - d) 7

    **Answer: c) 6**

12. **Which of the following traversal methods is not used to traverse a binary tree?**
    - a) In-order
    - b) Pre-order
    - c) Post-order
    - d) Random-order

    **Answer: d) Random-order**

13. **In a complete binary tree, how are the elements inserted?**
    - a) From left to right at each level
    - b) From right to left at each level
    - c) In random order
    - d) From top to bottom

    **Answer: a) From left to right at each level**

14. **What is the height of a perfect binary tree with 15 nodes?**
    - a) 3
    - b) 4
    - c) 5
    - d) 6

    **Answer: b) 4**

15. **In a binary search tree, which node is the smallest?**
    - a) The leftmost node
    - b) The rightmost node
    - c) The root node
    - d) The deepest node

    **Answer: a) The leftmost node**

16. **What is the balance factor of a node in an AVL tree?**
    - a) The height of the left subtree minus the height of the right subtree
    - b) The number of nodes in the left subtree minus the number of nodes in the right subtree
    - c) The height of the right subtree minus the height of the left subtree
    - d) The number of nodes in the right subtree minus the number of nodes in the left subtree

    **Answer: a) The height of the left subtree minus the height of the right subtree**

17. **Which type of binary tree guarantees O(log n) time complexity for search operations in the worst case?**
    - a) Binary Search Tree
    - b) AVL Tree
    - c) Complete Binary Tree
    - d) Full Binary Tree

    **Answer: b) AVL Tree**

18. **What is the result of performing a post-order traversal on a binary search tree?**
    - a) Sorted sequence in ascending order
    - b) Sorted sequence in descending order
    - c) Leaves before roots
    - d) Roots before leaves

    **Answer: c) Leaves before roots**

19. **In a binary search tree, the right child of the root node is greater than:**
    - a) The root node
    - b) The left child of the root node
    - c) All nodes in the left subtree
    - d) All of the above

    **Answer: d) All of the above**

20. **What is the average case time complexity for searching an element in a balanced binary search tree?**
    - a) O(1)
    - b) O(n)
    - c) O(log n)
    - d) O(n log n)

    **Answer: c) O(log n)**

## Conclusion
This document provided an introduction to Binary Trees (BT) and Binary Search Trees (BST) along with multiple-choice questions to help you test your understanding of these concepts. These questions cover various properties and operations of BTs and BSTs, helping you prepare for interviews and exams.

Feel free to reach out if you have any questions or need further assistance!