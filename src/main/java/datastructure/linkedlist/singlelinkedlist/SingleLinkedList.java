package datastructure.linkedlist.singlelinkedlist;

/**
 * 单链表
 *
 * @Author lhc
 * @Date 2020-10-26 17:20
 **/
class SingleLinkedList {

    //头节点
    private HeroNode head = new HeroNode(0, "头节点", "头节点");

    /**
     * 添加节点到单向链表：1.找到当前链表的最后一个节点  2.将最后节点的next指向添加的对象
     *
     * @param addNode 添加对象
     */
    void add(HeroNode addNode) {
        HeroNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        //当退出循环，temp指向链表的最后
        temp.setNext(addNode);
    }

    //显示链表
    void disPlayList() {
        if (head.getNext() == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.getNext();
        //不为空，输出当前节点并将temp移动到下一个节点
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

}