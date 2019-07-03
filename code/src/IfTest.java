import java.util.Random;
import java.util.Scanner;

/*
猜数字小游戏啊
 */
public class IfTest {
    public static void main(String[] args) {
        // 次数是3次
        int times = 3;

        // 创建随机数

        Random random = new Random();
        int randomNum = random.nextInt(100);

        System.out.println("猜数字小游戏, 你有3次机会哦");
        for (int time = 0; time < times; time++) {
            System.out.println(String.format("现在是第%s次哦", time));
            System.out.println("请输入数字");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            if (num == randomNum) {
                System.out.println("恭喜你猜对了");
                break;
            }
        }

        System.out.println(String.format("没猜出来吧, 我的数字是%s", randomNum));
    }
}
