package datastructure.linkedlist.singlelinkedlist;

/**
 * @Author lhc
 * @Date 2020-10-26 17:21
 * 英雄节点类
 **/
class HeroNode {
    /**
     * 英雄编号
     */
    private int no;
    /**
     * 名称
     */
    private String name;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 下一个节点
     */
    private HeroNode next;




    /**
     * 构造器
     */
    HeroNode() {

    }

    /**
     * 构造器
     *
     * @param no       英雄编号
     * @param name     名称
     * @param nickName 昵称
     */
    HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + getNo() +
                ", name='" + getName() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                '}';
    }

    int getNo() {
        return no;
    }

    void setNo(int no) {
        this.no = no;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getNickName() {
        return nickName;
    }

    void setNickName(String nickName) {
        this.nickName = nickName;
    }

    HeroNode getNext() {
        return next;
    }

    void setNext(HeroNode next) {
        this.next = next;
    }
}