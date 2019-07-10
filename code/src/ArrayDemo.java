/*
 * array demo
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // 定义等长数组
        int[] arr = new int[3];

        // 赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int a :
                arr) {
            System.out.println(a);
        }

    }
}
