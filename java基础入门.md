## java way

### 配置`java`环境变量

- JAVA_HOME
- CLASSPATH
- PATH

在终端输入  /usr/libexec/java_home  可以得到要配置的 JAVA_HOME 的路径

```
export JAVA_HOME
CLASS_PATH="$JAVA_HOME/lib"
PATH=".$PATH:$JAVA_HOME/bin"
```

### hello world

```java
class Demo1 {
    public static void main(String [] args) {
        System.out.println("hello world");
    }
}
```

```
javac Demo1.java

java Demo1
```

## input in

```java
Scanner sc = new Scanner(System.in);
System.out.println("请输入你的名称");
String name = sc.nextLine();
System.out.println(name);
```

## if statement

```java
import java.util.Random;
import java.util.Scanner;

/*
猜数字小游戏
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
```

## switch statement

```java
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
            case 1: case 2: case 3: {
                System.out.println("spring");
                break;
            }
            case 4: case 5: case 6: {
                System.out.println("summer");
                break;
            }
            case 7: case 8: case 9: {
                System.out.println("autumn");
                break;
            }
            case 10: case 11: case 12: {
                System.out.println("winter");
                break;
            }
            default: break;
        }
    }

}
```