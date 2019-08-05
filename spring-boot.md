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


- 直接参数传递: 但只支持`get`的query参数

```java
@RequestMapping(value = "/count", method = RequestMethod.GET)
public int count(int count) {
	return 2 * count;
}
```

- 使用`servlet` `request`

```java
@RequestMapping(value = "/count2", method = RequestMethod.GET)
    public Object count2(HttpServletRequest request) {
        String count = request.getParameter("count");
        int result = 0;
        try {

            result = Integer.parseInt(count);
        } catch (NumberFormatException e) {
            return "解析失败";
        }
        return 2 * result;
    }
```

- 使用`PathVariable`形式 支持url上的参数

```java
@RestController
    public class HelloController {
        @RequestMapping(value = "/hello/{id}/{name}", method = RequestMethod.GET)
        public String sayHello(@PathVariable("id") Integer id, @PathVariable("name") String name) {
            return "id:" + id + " name:" + name;
        }
    }
```

- 使用`RequestBody`

```java

@RequestMapping(value = "/do", method = RequestMethod.POST)
    public HashMap<String, Object> SayGreet(@RequestBody User user) {

	HashMap<String, Object> map = new HashMap<>();
	map.put("use", user);
	map.put("hello", "hello");
	return map;
}
```

- 使用`RequestParam`


```java
@RequestMapping(value = "/request/json", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public HashMap<String, Object> getByRequest(@RequestParam(value="name", required = false, defaultValue = "buglan") String name,
                                                @RequestParam(value="age", required = false, defaultValue = "0") Integer age) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("age", age);
        return map;
    }
```

##### 遇到的问题

- `Principal`这种写法不知道什么意思


```java
@RequestMapping(value = {"/account/export"}, method = RequestMethod.GET)
    public void accountExport(@WebPrincipal WcUser user,
                              @RequestParam(value = "corpId", required = false)  Long corpId,
                              @RequestParam(value = "groupId", required = false) Long groupId,
                              @RequestParam(value = "keyword", required = false) String keyword,
                              @RequestParam(value = "aliveStatus", required = false) String _aliveStatus,
                              @RequestParam(value = "sort", required = false) String _sort,
                              @RequestParam(value = "desc", required = false) String _desc,
                              HttpServletResponse response)
```

























