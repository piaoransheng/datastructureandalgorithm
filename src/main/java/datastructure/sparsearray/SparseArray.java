package datastructure.sparsearray;

/**
 * @Author lhc
 * @Date 2020-09-21 11:32
 **/
public class SparseArray {
    public static void main(String[] args) {
        //1. 创建二维数组
        int[][] chessArray = new int[9][9];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;
        printChessArray(chessArray);

        //2 将二维数组转成稀疏数组
        int[][] sparseArray = makeSparseArrayFromChessArray(chessArray);
        printSparseArray(sparseArray);

        //3 将稀疏数组还原成二维数组
        chessArray= makeChessArrayFromSparseArray(sparseArray);
        printChessArray(chessArray);

    }

    /**
     * 打印二维数组
     *
     * @param chessArray 二维数组
     */
    private static void printChessArray(int[][] chessArray) {
        //输出二维数组
        System.out.println("二维数组输出");
        for (int[] row : chessArray) {
            for (int number : row) {
                System.out.printf("%d\t", number);
            }
            System.out.println();
        }
    }

    /**
     * 打印稀疏数组
     *
     * @param sparseArray 稀疏数组
     */
    private static void printSparseArray(int[][] sparseArray) {
        //输出二维数组
        System.out.println("稀疏数组输出方式1");
        for (int[] row : sparseArray) {
            for (int number : row) {
                System.out.printf("%d\t", number);
            }
            System.out.println();
        }

        System.out.println("稀疏数组输出方式2");
        for (int[] result : sparseArray) {
            System.out.printf("%d\t%d\t%d\t\n", result[0], result[1], result[2]);
        }
    }

    /**
     * 将二维数组转成稀疏数组
     *
     * @param chessArray 二维数组
     * @return 稀疏数组
     */
    private static int[][] makeSparseArrayFromChessArray(int[][] chessArray) {
        //二维数组总行数
        int rowSum = 0;
        //二维数组总列数
        int lineSum = 0;

        //TODO 1.获取二维数组非零个数
        //用与记录非零元素
        int count = 0;
        for (int[] row : chessArray) {
            rowSum = chessArray.length;
            lineSum = row.length;
            for (int data : row) {
                if (data != 0) {
                    count++;
                }
            }
        }
        //TODO 2.创建对应的稀疏数组  稀疏数组的列始终为3  行为二维数组非零个数+1
        int[][] sparseArray = new int[count + 1][3];

        //TODO 3.给稀疏数组赋值
        //a.第一行
        sparseArray[0][0] = rowSum;
        sparseArray[0][1] = lineSum;
        sparseArray[0][2] = count;

        //b.其他行 遍历二维数组获取非0的元素存放到稀疏数组
        //用于记录稀疏数组赋值行
        int sparseArrayRow = 1;
        for (int row = 0; row < rowSum; row++) {
            for (int line = 0; line < lineSum; line++) {
                if (chessArray[row][line] != 0) {
                    sparseArray[sparseArrayRow][0] = row;
                    sparseArray[sparseArrayRow][1] = line;
                    sparseArray[sparseArrayRow][2] = chessArray[row][line];
                    sparseArrayRow++;
                }
            }
        }
        return sparseArray;
    }

    /**
     * 将稀疏数组转成二维数组
     *
     * @param sparseArray 稀疏数组
     * @return 二维数组
     */
    private static int[][] makeChessArrayFromSparseArray(int[][] sparseArray) {
        //TODO 1.从稀疏数组获取二维数组的总行数与总列数 创建二维数组
        int rowSum = sparseArray[0][0];
        int lineSum = sparseArray[0][1];
        int[][] chessArray = new int[rowSum][lineSum];

        //TODO 2.给二维数组赋值
        //稀疏数组的总行数
        int sparseArrayRow = sparseArray.length;
        //int sparseArrayRow = sparseArray[0][2];

        for (int row = 1; row < sparseArrayRow; row++) {
            //行
            int r = sparseArray[row][0];
            //列
            int l = sparseArray[row][1];
            //值
            int value =  sparseArray[row][2];
            chessArray[r][l] = value;
        }
        return chessArray;
    }
}