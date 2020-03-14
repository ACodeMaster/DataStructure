package com.xawl.tree;

import javafx.scene.control.cell.ProgressBarTreeTableCell;
import sun.reflect.generics.tree.Tree;

/**
 * Author: 齐烟九点天踦爵
 * Time: 2020/3/12 19:38
 * Description:
 */
public class BinaryTreeTest {
    private TreeNode root;
    public BinaryTreeTest(TreeNode root){
        this.root=root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    //前序遍历
    public void preorder(){
        if(root!=null){
            root.preOrder();
        }else{
            System.out.println("当前树是空树");
        }
    }
    //中序遍历
    public void inorder(){
        if(root!=null){
            root.inOrder();
        }else{
            System.out.println("当前树是空树");
        }
    }
    public void postorder(){
        if(root!=null){
            root.postOrder();
        }else{
            System.out.println("当前树是空树");
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        BinaryTreeTest bt = new BinaryTreeTest(root);
        //创建两个节点，并将其设置为根节点的左右节点
        TreeNode lRoot = new TreeNode(2);
        TreeNode rRoot = new TreeNode(3);
        root.setlTreeNode(lRoot);
        root.setrTreeNode(rRoot);
        //为第二层的节点创建两个字节点
        lRoot.setlTreeNode(new TreeNode(4));
        lRoot.setrTreeNode(new TreeNode(5));
        rRoot.setlTreeNode(new TreeNode(6));
        rRoot.setrTreeNode(new TreeNode(7));
        System.out.print("前序遍历：");
        bt.preorder();
        System.out.println();
        System.out.print("中序遍历：");
        bt.inorder();
        System.out.println();
        System.out.print("后序遍历：");
        bt.postorder();
    }
}

