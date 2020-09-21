package datastructure.queue.circlequeue;


/**
 * @Author lhc
 * @Date 2020-09-21 15:30
 * <p> 数组模拟环形队列
 **/
class CircleArrayQueue {
    /**
     * 表示最大容量 + 1   假设MaxSize为4，那么最多只能存3个元素
     */
    private int maxSize;
    /**
     * 队列的第一个位置
     */
    private int front;
    /**
     * 队列尾
     */
    private int rear;
    /**
     * 队列数据
     */
    private int[] arr;

    /**
     * 创建队列的构造器
     *
     * @param arrayMaxSize 数组容量
     */
    CircleArrayQueue(int arrayMaxSize) {
        maxSize = arrayMaxSize;
        arr = new int[maxSize];
        //指向队列头部,更准确是队列头的前一个位置
        front = 0;
        //指向队列尾部，即队列的最后一个数据
        rear = 0;
    }

    /**
     * 判断队列是否已满
     *
     * @return True:队列已满； False:队列未满
     */
    private boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 判断队列是否为空
     *
     * @return 队列是否为空
     */
    private boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加数据到队列
     *
     * @param n 添加值
     */
    void addQueue(int n) {
        //1.判断是否满了
        if (isFull()) {
            System.out.println("队列已满无法添加");
            return;
        }
        //2.添加值
        //直接将数据加入
        arr[rear] = n;
        //将rear后移 这里必须考虑取模
        rear = (rear + 1) % maxSize;
    }

    /**
     * 显示队列的头一个数据
     *
     * @return 队列的头数据
     */
    int showHeadData() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有第一个数据");
        }
        return arr[front];
    }

    /**
     * 取出队列头一个数据
     *
     * @return 队列头部前一个位置的值
     */
    int getQueue() {
        //1.判断是否为空
        if (isEmpty()) {
            throw new RuntimeException("队列为空不能取头个数据");
        }
        //1.取第一个数据
        int value = arr[front];
        //2.front后移
        front = (front + 1) % maxSize;
        //3.返回数据
        return value;
    }

    /**
     * 显示队列的所有数据
     */
    void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空，无法显示");
            return;
        }
        //从front开始遍历，遍历多少个元素（队列的有效个数）
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    /**
     * 求出当前队列有效个数
     *
     * @return 返回当前队列有效个数
     */
    private int size() {
        return (rear + maxSize - front) % maxSize;
    }

}