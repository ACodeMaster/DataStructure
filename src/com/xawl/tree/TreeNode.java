package com.xawl.tree;

/**
 * Author: 齐烟九点天踦爵
 * Time: 2020/3/12 20:01
 * Description:
 */
public class TreeNode {
    private int data;
    private TreeNode lTreeNode;
    private TreeNode rTreeNode;
    public TreeNode(int data){
        this.data=data;
    }

    public TreeNode(TreeNode lTreeNode,int data,  TreeNode rTreeNode) {
        this.data = data;
        this.lTreeNode = lTreeNode;
        this.rTreeNode = rTreeNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
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
    /*
     *
     * @Date  2020/3/14 11:36
     * @param data
     * @return void
     * 删除思路：
     *  1.先看根节点的值是否是要删除的，不是则进行第2步
     *  2.判断根节点的左子节点是否是要删除的，否则进行第3步
     *  3.
     *
     */
    public void delNode(int data){
        if(this.lTreeNode!=null && this.lTreeNode.data==data){
            this.lTreeNode=null;
            return;
        }
        if(this.rTreeNode!=null && this.rTreeNode.data==data){
            this.rTreeNode=null;
            return;
        }
        if(this.lTreeNode!=null){
            this.lTreeNode.delNode(data);
        }
        if(this.rTreeNode!=null){
            this.rTreeNode.delNode(data);
        }
    }
}
