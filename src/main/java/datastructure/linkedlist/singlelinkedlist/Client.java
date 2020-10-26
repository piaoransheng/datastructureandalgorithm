package datastructure.linkedlist.singlelinkedlist;

/**
 * @Author lhc
 * @Date 2020-10-26 17:44
 **/
public class Client {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.disPlayList();

        //添加英雄节点
        HeroNode firstNode = new HeroNode();
        firstNode.setNo(1);
        firstNode.setName("宋江");
        firstNode.setNickName("及时雨");
        singleLinkedList.add(firstNode);

        singleLinkedList.disPlayList();

        //添加英雄节点
        HeroNode secondNode = new HeroNode();
        secondNode.setNo(2);
        secondNode.setName("卢俊义");
        secondNode.setNickName("玉麒麟");
        singleLinkedList.add(secondNode);

        singleLinkedList.disPlayList();

    }
}