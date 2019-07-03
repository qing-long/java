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
```