package cn.xiucai.datastructurepractice.linkedlist;


/**
 * @author zhangxiulin
 * @date 2023/8/2 15:05
 * @description 自定义的双向链表
 */
public class MyLinkedList {

    //头节点
    Node head;
    //尾节点
    Node tail;

    /**
     * 新增节点
     */
    public void add(String value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.pre = tail;
            tail = newNode;
        }
    }

    /**
     * 指定位置新增节点
     */
    public boolean addIndex(int index, String value) {
        //不符合数据规范，返回
        if (index < 0) {
            return false;
        }

        Node newNode = new Node(value);

        //定义当前节点等于头结点
        Node cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
            //说明是在链表的最后加的
            if (cur == null) {
                this.add(value);
                return true;
            }

            if (i == index) {
                cur.pre.next = newNode;
                newNode.next = cur;
            }
        }

        return false;
    }

    /**
     * 获取指定下标的元素
     */
    public String get(int index) {
        if (index < 0) {
            return null;
        }

        if (index == 0) {
            return head.value;
        }

        Node cur = head;
        for (int i = 1; i <= index; i++) {
            cur = cur.next;

            if (i == index) {
                if (cur == null) {
                    return null;
                }

                return cur.value;
            }
        }

        return null;
    }

    /**
     * 获取指定下标的元素
     */
    public Node getNode(int index) {
        if (index < 0) {
            return null;
        }

        if (index == 0) {
            return head;
        }

        Node cur = head;
        for (int i = 1; i <= index; i++) {
            cur = cur.next;
            if (cur == null) {
                return null;
            }

            if (i == index) {
                return cur;
            }
        }

        return null;
    }

    /**
     * 移除某个节点
     */
    public boolean remove(int index) {
        //不符合数据规范，返回
        if (index < 0) {
            return false;
        }

        //定义当前节点等于头结点
        Node cur = head;

        //要移除第一个节点
        if (index == 0) {
            //头结点变为第二个节点
            head = head.next;
            return true;
        }

        for (int i = 1; i <= index; i++) {
            cur = cur.next;

            //越界的情况
            if (cur == null) {
                tail.pre = tail;
                return false;
            }

            if (i == index) {
                cur.pre.next = cur.next;
                cur.next = null;

                return true;
            }
        }

        return false;
    }

    /**
     * 更新某个节点
     */
    public boolean update(int index, String newValue) {
        Node node = this.getNode(index);
        if (node == null) {
            return false;
        }

        node.value = newValue;
        return true;
    }

    /**
     * 打印链表中的所有元素，用于打印(测试用)
     */
    public void getAll() {
        if (head == null) {
            System.out.println("该链表没有任何数据");
        }

        Node cur = head;
        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.next;
        }
    }
}
