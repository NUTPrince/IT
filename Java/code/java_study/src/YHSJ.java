import java.util.Scanner;

public class YHSJ {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in) ;
        System.out.println("请输入所要打印的杨辉三角行数：");
        //获取行号
        int n = sc.nextInt() ;
        printYHSJ(n);

        long endTime = System.currentTimeMillis() ;
        System.out.println("程序执行时间为："+(endTime-startTime)+"毫秒");
    }
    private static void printYHSJ(int m) {
        int rows = m ;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            // 打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

}


