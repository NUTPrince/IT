import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        double engSalary = 0.0;
        int beSalary;
        int comResult;
        double workDay;
        double insurance;

        Scanner intput = new Scanner(System.in);
        int userSel = -1;

        while (true){
            System.out.println("-------------------------------");
            System.out.println("|      java 工程师管理系统      |");
            System.out.println("-------------------------------");
            System.out.println(
                    "1.输入Java工程师资料\n" +
                    "2.删除指定Java工程师资料\n" +
                    "3.查询Java工程师资料\n" +
                    "4.修改Java工程师资料\n" +
                    "5.计算Java工程师的月薪\n" +
                    "6.保存新添加的工程师资料\n" +
                    "7.对Java工程师信息排序\n" +
                    "8.输出所有Java工程师信息\n" +
                    "9.清空所有Java工程师数据\n" +
                    "10.打印Java工程师数据报表\n" +
                    "11.从文件重新导入Java工程师数据"
                    "0.退出系统");
            System.out.println("请输入你的选择（编号）：");
            userSel = intput.nextInt();
            switch (userSel){
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("本功能正在开发中，敬请期待～");
                    break;
                case 5:
                    

            }
        }

    }
}
