package erChaShu;

import erChaShu.TreeNode;

public class erChaSearchTree {
    TreeNode root;

    public erChaSearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertNode(this.root,data);
    }

    private TreeNode insertNode (TreeNode root, int data) {
        if (root==null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data); //root.left = ... 不能直接return一个节点 不然 root跟儿子节点链接不起来
        } else {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    public boolean search(int key) {
        return searchNode(this.root,key);
    }
    private boolean searchNode(TreeNode root,int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        } else if (key < root.data) {
            return searchNode(root.left,key);
        } else {
            return searchNode(root.right,key);
        }
    }
}
