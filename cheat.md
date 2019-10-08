# 学习途径(just like cheat)

> 每次学习一门新的编程语言, 都会有大量需要学习的知识点, 本文打算总结部分相同点, 减少学习的成本, 相当于一份笔记的学习框架吧>-< 我也不太确定哦.


## 专注语法

### 了解hello world

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
```

### 了解选择语句

- if

```java
import java.util.Random;

public class IF {
    public static void main(String[] args) {
       Integer random = new Random().nextInt(10);

       if (random > 5) {
           System.out.println("random > 5");
       }
       else if (random < 3) {
           System.out.println("random > 7");
       }
       else {
           System.out.println("random >= 3 <= 5");
       }
    }
}
```


- switch

```java
public class Switch {
    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("hello world");
        }
    }
}
```


### 了解循环语句

- while

```java
public class While {
    public static void main(String[] args) {
        int a = 1;
        while (a < 10) {
            System.out.println(a);
            a += 1;
        }
    }
}

```

- for

```java
public class For {
    public static void main(String[] args) {
        String name = "hello world";

        for (int i = 0; i< name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}

```

- do while

```java
public class DoWhile {

    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println("just do one time");
            a += 1;

        } while (a < 0);
    }
}

```

### 了解语言关键字

```
abstract	表明类或者成员方法具有抽象属性
assert	断言，用来进行程序调试
boolean	基本数据类型之一，声明布尔类型的关键字
break	提前跳出一个块
byte	基本数据类型之一，字节类型
case	用在switch语句之中，表示其中的一个分支
catch	用在异常处理中，用来捕捉异常
char	基本数据类型之一，字符类型
class	声明一个类
const	保留关键字，没有具体含义
continue	回到一个块的开始处
default	默认，例如，用在switch语句中，表明一个默认的分支。Java8 中也作用于声明接口函数的默认实现
do	用在do-while循环结构中
double	基本数据类型之一，双精度浮点数类型
else	用在条件语句中，表明当条件不成立时的分支
enum	枚举
extends	表明一个类型是另一个类型的子类型。对于类，可以是另一个类或者抽象类；对于接口，可以是另一个接口
final	用来说明最终属性，表明一个类不能派生出子类，或者成员方法不能被覆盖，或者成员域的值不能被改变，用来定义常量
finally	用于处理异常情况，用来声明一个基本肯定会被执行到的语句块
float	基本数据类型之一，单精度浮点数类型
for	一种循环结构的引导词
goto	保留关键字，没有具体含义
if	条件语句的引导词
implements	表明一个类实现了给定的接口
import	表明要访问指定的类或包
instanceof	用来测试一个对象是否是指定类型的实例对象
int	基本数据类型之一，整数类型
interface	接口
long	基本数据类型之一，长整数类型
native	用来声明一个方法是由与计算机相关的语言（如C/C++/FORTRAN语言）实现的
new	用来创建新实例对象
package	包
private	一种访问控制方式：私用模式
protected	一种访问控制方式：保护模式
public	一种访问控制方式：共用模式
return	从成员方法中返回数据
short	基本数据类型之一,短整数类型
static	表明具有静态属性
strictfp	用来声明FP_strict（单精度或双精度浮点数）表达式遵循IEEE 754算术规范
super	表明当前对象的父类型的引用或者父类型的构造方法
switch	分支语句结构的引导词
synchronized	表明一段代码需要同步执行
this	指向当前实例对象的引用
throw	抛出一个异常
throws	声明在当前定义的成员方法中所有需要抛出的异常
transient	声明不用序列化的成员域
try	尝试一个可能抛出异常的程序块
void	声明当前成员方法没有返回值
volatile	表明两个或者多个变量必须同步地发生变化
while	用在循环结构中
```

### 了解语言作用域

> 在java中，变量的作用域分为四个级别：类级、对象实例级、方法级、块级。

> java用一对大括号作为语句块的范围，称为作用域，在作用域里定义的变量，只有在该作用域结束之前才可使用。 

*　类级变量又称全局级变量或静态变量，需要使用static关键字修饰。类级变量在类定义后就已经存在，占用内存空间，可以通过类名来访问，不需要实例化。

*　对象实例级变量就是成员变量，实例化后才会分配内存空间，才能访问。成员变量是定义在方法之外，类之内的。成员变量随着对象的创建而存在，随着对象的消失而消失。

*　方法级变量就是在方法内部定义的变量，就是局部变量。局部变量在调用了对应的方法时执行到了创建该变量的语句时存在，局部变量的作用域从它被声明的点开始，一旦出了自己的作用域马上从内存中消失。

*　块级变量就是定义在一个块内部的变量，变量的生存周期就是这个块，出了这个块就消失了，比如 if、for 语句的块。块是指由大括号包围的代码，

### 了解访问权限修饰符

- 默认访问权限没有关键字，通常被称为包访问权限（有时也称为 friendly)

这意味着当前包中的所有其他类都可以访问那个成员。对于这个包之外的类，这个成员看上去是 private 的。由于一个编译单元（即一个文件）只能隶属于一个包，所以通过包访问权限，位于同一编译单元中的所有类彼此之间都是可访问的。

- public: 接口访问权限

当你使用关键字 public，就意味着紧随 public 后声明的成员对于每个人都是可用的，尤其是使用类库的客户端程序员更是如此。

- private: 你无法访问

关键字 private 意味着除了包含该成员的类，其他任何类都无法访问这个成员。同一包中的其他类无法访问 private 成员，因此这等于说是自己隔离自己。另一方面，让许多人合作创建一个包也是有可能的。使用 private，你可以自由地修改那个被修饰的成员，无需担心会影响同一包下的其他类。

- protected: 继承访问权限

基类的创建者会希望某个特定成员能被继承类访问，但不能被其他类访问。这时就需要使用 protected。protected 也提供包访问权限，也就是说，相同包内的其他类可以访问 protected 元素。



### 函数

- 函数的输入输出


```java
public class InputOutPut {
    public String Name(String name) {
        return name;
    }

    public static void main(String[] args) {
        String name = "buglan";

        System.out.println(new InputOutPut().Name(name));

    }
}
```

- 函数的闭包(closure)

https://amitrp.blogspot.com/2012/08/at-first-sight-with-closures-in-java.html


- 函数的递归

```java
public class Fab {

    private static int fab(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return fab(index - 1) + fab(index - 2);
    }

    public static void main(String[] args) {
        System.out.println(fab(6));

    }

}

```


### 类

- 构造器
- 继承
- 超类
- 组合
- 多继承

### 结构 & 写法

- java项目的结构如何组织

一般使用maven工具生成的结构

```bash
mvn -B archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DgroupId=com.leetcode.simple \
  -DartifactId=leetcode
```

具体结构:

```bash
lan at neo in ~/leetcode
$ tree .
.
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── leetcode
    │               └── simple
    │                   └── App.java
    └── test
        └── java
            └── com
                └── leetcode
                    └── simple
                        └── AppTest.java

11 directories, 3 files
```


- 单文件练手项目的结构


## 专注语言特性

> 编程语言的各种特性, 比如python语言中的列表的各种操作, java语言中的反射.

- 了解java中的向上转型

- 了解java中的多态

- 了解java中的接口

- java中的枚举


## 学习中碰到遇到的难题

- 覆写私有方法

```java
package polymorphism;

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }
    
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

public Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}
```

output:
```java
private f()
```

因为基类版本的 f() 屏蔽了 Derived ，因此它都不算是重载方法。
只有非 private 方法才能被覆写，但是得小心覆写 private 方法的现象，编译器不报错，但不会按我们所预期的执行。为了清晰起见，派生类中的方法名采用与基类中 private 方法名不同的命名。

如果使用了 @Override 注解，就能检测出问题：


## 觉得比较恶心的几点

- java bean

比如如果需要序列化和反序列化的得像golang中写一个struct一样, java得写一个java bean 或直接构造一个map来搞, 多谢了很多额外的代码, 太恶心了.

```java
// 示例代码

```
