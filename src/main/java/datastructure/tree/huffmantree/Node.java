package datastructure.tree.huffmantree;

/**
 * 节点类
 *
 * @Author lhc
 * @Date 2020-10-30 16:41
 **/
public class Node implements Comparable<Node> {
    /**
     * 节点权值，即节点上面的数值
     */
    int value;
    /**
     * 左子节点
     */
    Node leftNode;
    /**
     * 右子节点
     */
    Node rightNode;

    /**
     * 构造函数
     *
     * @param value 节点权值
     */
    Node(int value) {
        this.value = value;
    }

    public void disPlay(){
        System.out.println(this);
        if (this.leftNode != null){
            this.disPlay();
        }
        if (this.rightNode != null){
            this.disPlay();
        }
    }


    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public int compareTo(Node o) {
        //表示从小到大排序，入股要从大到小排序，加个负号：-（this.value - o.value）
        return this.value - o.value;
    }
}