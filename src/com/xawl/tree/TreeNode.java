package com.xawl.tree;

/**
 * Author: 齐烟九点天踦爵
 * Time: 2020/3/12 20:01
 * Description:
 */
public class TreeNode {
    private Object data;
    private TreeNode lTreeNode;
    private TreeNode rTreeNode;
    public TreeNode(Object data){
        this.data=data;
    }

    public TreeNode(TreeNode lTreeNode,Object data,  TreeNode rTreeNode) {
        this.data = data;
        this.lTreeNode = lTreeNode;
        this.rTreeNode = rTreeNode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public TreeNode getlTreeNode() {
        return lTreeNode;
    }

    public void setlTreeNode(TreeNode lTreeNode) {
        this.lTreeNode = lTreeNode;
    }

    public TreeNode getrTreeNode() {
        return rTreeNode;
    }

    public void setrTreeNode(TreeNode rTreeNode) {
        this.rTreeNode = rTreeNode;
    }


    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
    //前序遍历
    public void preOrder(){
        System.out.print(this.getData()+" ");
        if(this.lTreeNode!=null){
            this.lTreeNode.preOrder();
        }
        if(this.rTreeNode!=null){
            this.rTreeNode.preOrder();
        }
    }
    public void inOrder(){
        if(this.lTreeNode!=null){
            this.lTreeNode.inOrder();
        }
        System.out.print(this.getData()+" ");
        if(this.rTreeNode!=null){
            this.rTreeNode.inOrder();
        }
    }
    //后序遍历
    public void postOrder(){
        if(this.lTreeNode!=null){
            this.lTreeNode.postOrder();
      }
        if(this.rTreeNode!=null){
            this.rTreeNode.postOrder();
        }
        System.out.print(this.getData()+" ");
    }
}
