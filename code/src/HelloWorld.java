import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名称");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
