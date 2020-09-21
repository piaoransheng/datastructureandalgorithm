package datastructure.queue.BasicQueue;



/**
 * @Author lhc
 * @Date 2020-09-21 15:30
 * <p> 数组模拟队列
 **/
class BasicArrayQueue {
    /**
     * 表示最大容量
     */
    private int maxSize;
    /**
     * 队列头部的前一个位置
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
    BasicArrayQueue(int arrayMaxSize) {
        maxSize = arrayMaxSize;
        arr = new int[maxSize];
        //指向队列头部,更准确是队列头的前一个位置
        front = -1;
        //指向队列尾部，即队列的最后一个数据
        rear = -1;
    }

    /**
     * 判断队列是否已满
     *
     * @return True:队列已满； False:队列未满
     */
    private boolean isFull() {
        return rear == maxSize - 1;
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
        rear++;
        arr[rear] = n;
        System.out.println("添加成功");
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
        front++;
        return arr[front];
    }

    /**
     * 显示队列的所有数据
     */
    void showQueue(){
        if (isEmpty()){
            System.out.println("队列为空，无法显示");
            return;
        }
        for (int i =0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    /**
     * 显示队列的头一个数据
     *
     * @return 队列的头数据
     */
    int showHeadData(){
        if (isEmpty()){
            throw new RuntimeException("队列为空，没有第一个数据");
        }
        return arr[front+1];
    }
}