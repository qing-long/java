import java.util.Scanner;

/*
 * 判断输入的数字是什么月份
 */
public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("输入数字, 给出月份");
        Scanner sc = new Scanner(System.in);
        var month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3: {
                System.out.println("spring");
                break;
            }
            case 4:
            case 5:
            case 6: {
                System.out.println("summer");
                break;
            }
            case 7:
            case 8:
            case 9: {
                System.out.println("autumn");
                break;
            }
            case 10:
            case 11:
            case 12: {
                System.out.println("winter");
                break;
            }
            default:
                break;
        }
    }

}
