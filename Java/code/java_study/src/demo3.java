/*等腰杨辉三角
挑战介绍
杨辉三角是中国古代数学的杰出研究成果之一，它把二项式系数图形化，
把组合数内在的一些代数性质直观地从图形中体现出来，
是一种离散型的数与形的结合。具有以下几点性质：
1.第 n 行的数字有 n 项。
2.每行数字左右对称，由 1 开始逐渐变大。
3.每个数等于它上方两数之和。
*/
public class demo3 {
    public static void yh(int n){
        int yh[][] = new int[n][];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            yh[i] = new int[i+1];
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }//打印空格
            for (int j = 0; j < i+1; j++) {
                if (j==0||j==yh[i].length-1){
                    yh[i][j]=1;//打印行首，行末的1
                }else {
                    yh[i][j]=yh[i-1][j-1]+yh[i-1][j];//打印中间的数（上一行相邻两数之和）
                }
                System.out.printf("%4s",yh[i][j]+" ");
                sum += yh[i][j];
            }
            System.out.println();//打印完一行，然后换行
        }
    }

    public static void main(String[] args) {
        yh(5);
    }
}
