## Spring Boot


### 实例


#### hello world: 最小化spring boot

1. 使用spring initial 初始化项目
2. 添加controller.HelloController

```java
package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }
```

3. 除上文写法外, 还可使用`Controller`注解

```java
@Controller
public class GreetController {

    @RequestMapping("/a")
    @ResponseBody
    public String hello4() {
        return "hello";
    }
}
```

##### 遇到的问题

- maven依赖使用idea的auto-import, 但是没有起作用
- 运行springboot 初始化项目无法运行
- spring-boot 出现错误 `classnotfound`


#### request method: get post put delete

```java
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "this is get method";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello1() {
        return "this is post method";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.PUT)
public String hello2() {
    return "this is put method";
}

    @RequestMapping(value = "/hello", method = RequestMethod.DELETE)
    public String hello3() {
        return "this is delete method";
    }
}
```

#### argument parser: 参数解析

































