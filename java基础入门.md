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

