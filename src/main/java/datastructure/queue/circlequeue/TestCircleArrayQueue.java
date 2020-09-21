package datastructure.queue.circlequeue;


import java.util.Scanner;

/**
 * @Author lhc
 * @Date 2020-09-21 16:11
 **/
public class TestCircleArrayQueue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CircleArrayQueue basicArrayQueue = new CircleArrayQueue(4);

        while (true) {
            System.out.println("s(show)：显示队列");
            System.out.println("a(add)：添加数据到队列");
            System.out.println("g(get)：取出队列第一个数据");
            System.out.println("h(head)：查看队列头的数据");
            System.out.println("e(exit)：退出程序");
            //输入字符串的第一个值
            char c = scanner.next().charAt(0);
            switch (c) {
                case 's':
                    basicArrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入要添加到队列的整数");
                    int addValue = scanner.nextInt();
                    basicArrayQueue.addQueue(addValue);
                    break;
                case 'g':
                    try {
                        int result = basicArrayQueue.getQueue();
                        System.out.printf("取出的数据是%d\n", result);
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int headData = basicArrayQueue.showHeadData();
                        System.out.printf("队列的头数据是%d\n", headData);
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("程序退出");
                    break;
            }
        }
    }
}