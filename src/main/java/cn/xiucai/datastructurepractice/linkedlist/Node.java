package cn.xiucai.datastructurepractice.linkedlist;


/**
 * @author zhangxiulin
 * @date 2023/8/2 15:03
 * @description 自定义节点
 */
public class Node {
    //节点的值
    String value;

    //头节点
    Node pre;

    //尾节点
    Node next;

    /**
     * 构造器，初始化节点
     */
    public Node(String value) {
        this.value = value;
    }
}
