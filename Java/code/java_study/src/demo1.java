/*求 1~1000 之间的水仙花数
水仙花数是指一个 n 位数 ( n>=3 )，它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3+5^3+3^3=153）,
利用条件语句和循环语句求 1~1000 之间的水仙花数。
*/
public class demo1 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if (i == a*a*a + b*b*b + c*c*c){
                System.out.println(i);
            }
        }
    }
}
