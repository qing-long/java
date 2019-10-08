## 错题本: 学习中遇到的问题


### maven依赖使用idea的auto-import, 但是没有起作用

- 检查是否使用了`idea`自带的maven
- 在preferences 切换到自己安装的maven


### 运行springboot 初始化项目无法运行

```
2019-08-04 22:51:02.160  WARN 31841 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start web server; nested exception is org.springframework.context.ApplicationContextException: Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean.
2019-08-04 22:51:02.840 ERROR 31841 --- [           main] o.s.boot.SpringApplication               : Application run failed
```

#### 解决方法

在入口加上这么一句话

```java
@EnableAutoConfiguration
public class DemoApplication   {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
```

##### 参考

- https://www.cnblogs.com/gudi/p/8711606.html
- https://stackoverflow.com/questions/21783391/spring-boot-unable-to-start-embeddedwebapplicationcontext-due-to-missing-embedd



#### 后记

可能是`spring 入口忘了写注解`

```java
@SpringBootApplication
public class DemoApplication   {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
```



#### spring-boot 出现错误`classnotfound`

可能是依赖问题,

- 删除`pom.xml`
- 执行`mvn clean install`
- 重新安装依赖, 在运行
- 如果是idea, 可能是使用了idea自带的maven

