package datastructure.tree.huffmantree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author lhc
 * @Date 2020-10-30 16:40
 **/
public class HuffManTree {
    public static void main(String[] args) {
        int[] arr = {13, 7, 8, 3, 29, 6, 1};
        createHuffManTree(arr);
    }


    /**
     * 创建赫夫曼树
     *
     * @param arr 数组
     */
    private static Node createHuffManTree(int[] arr) {
        //1.将数组转成Node类放在集合中
        List<Node> nodeList = new ArrayList<Node>();
        for (int value : arr) {
            Node node = new Node(value);
            nodeList.add(node);
        }

        //最终的集合只剩下一个父节点，父节点下面多个节点，即一颗赫夫曼树
        while (nodeList.size() > 1) {

            //2.对node集合进行从小到大排序
            Collections.sort(nodeList);

            //3.取出权值最小的两个节点
            Node leftNode = nodeList.get(0);
            Node rightNode = nodeList.get(1);

            //4.创建父节点并添加到node集合汇总
            Node parentNode = new Node(leftNode.value + rightNode.value);
            nodeList.add(parentNode);

            //5.组成一颗新的二叉树
            parentNode.leftNode = leftNode;
            parentNode.rightNode = rightNode;

            //6.从Node集合中删除已经处理过的node
            nodeList.remove(leftNode);
            nodeList.remove(rightNode);
        }
        return nodeList.get(0);
    }
}