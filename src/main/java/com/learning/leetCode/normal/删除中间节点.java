package com.learning.leetCode.normal;

import java.util.List;

/**
 * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 *
 * 示例：
 *
 * 输入：单向链表a->b->c->d->e->f中的节点c
 * 结果：不返回任何数据，但该链表变为a->b->d->e->f
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-middle-node-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 删除中间节点 {

     static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public static void deleteNode(ListNode node) {

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next = new ListNode(5);
        deleteNode(listNode);
    }

}
