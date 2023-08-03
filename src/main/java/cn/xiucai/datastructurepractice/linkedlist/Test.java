package cn.xiucai.datastructurepractice.linkedlist;


import java.util.Objects;

/**
 * @author zhangxiulin
 * @date 2023/8/2 15:20
 * @description 测试我自定义的链表
 */
public class Test {
    public static void main(String[] args) {
        //testAdd()

        //testGet();

        //testRemove();

        //testUpdate()

        //testUpdate();

        testIndexAdd();
    }

    /**
     * 测试链表中获取数据
     */
    private static void testGet() {
        MyLinkedList list = new MyLinkedList();
        list.add("哇");
        list.add("哈");
        list.add("吧");

        String value = list.get(3);
        if (Objects.isNull(value)) {
            System.out.println("链表中没有对应的值");
        } else {
            System.out.println("值: " + value);
        }
    }

    /**
     * 测试链表中新增数据
     */
    private static void testAdd() {
        MyLinkedList list = new MyLinkedList();
        list.add("哇");
        list.add("哈");
        list.add("吧");

        list.getAll();
    }

    /**
     * 测试链表中指定位置新增数据
     */
    private static void testIndexAdd() {
        MyLinkedList list = new MyLinkedList();
        list.add("哇");
        list.add("哈");
        list.add("吧");

        list.addIndex(4, "妈类个巴子");

        list.getAll();
    }

    /**
     * 测试链表移除数据
     */
    private static void testRemove() {
        MyLinkedList list = new MyLinkedList();
        list.add("哇");
        list.add("哈");
        list.add("吧");

        list.remove(3);

        list.getAll();
    }

    private static void testUpdate() {
        MyLinkedList list = new MyLinkedList();
        list.add("哇");
        list.add("哈");
        list.add("吧");

        list.update(2, "妈类个巴子");

        list.getAll();
    }

}
