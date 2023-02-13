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
                    "11.从文件重新导入Java工程师数据\n" +
                    "0.退出系统");
            System.out.println("请输入你的选择（编号）：");
            userSel = intput.nextInt();
            switch (userSel){
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    System.out.println("本功能正在开发中，敬请期待～");
                    break;
                case 5:
                    System.out.println("请输入底薪：");
                    beSalary = intput.nextInt();

                    System.out.println("请输入绩效分数：");
                    comResult = intput.nextInt();

                    System.out.println("请输入工时（天数）：");
                    workDay = intput.nextInt();

                    System.out.println("应缴保险金额：");
                    insurance = intput.nextInt();

                    engSalary = beSalary + beSalary * 0.25 * comResult / 100 + 15 * workDay - insurance;
                    System.out.println("您的月工资为：" + engSalary);
                    break;
                case 0:
                    System.out.println("程序即将关闭，感谢使用！");
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
            if (userSel == 0){
                break;
            }
        }

    }
}
