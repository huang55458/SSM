package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/12 15:55
 */
@Controller
@RequestMapping("json")
public class JsonController {
    @GetMapping("boolean.form")
    @ResponseBody
    public boolean test1() {
        return true;
    }

    @GetMapping("map.form")
    @ResponseBody
    public HashMap<String, Object> test2() {
        HashMap<String, Object> map = new HashMap<>(8);
        map.put("name", "name");
        map.put("value", "value");
        map.put("pass", 1234);
        map.put("isTrue", true);
        map.put("num", 3.3);
        return map;
    }

    @GetMapping("list.form")
    @ResponseBody
    public List<String> test3() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        return list;
    }

    @GetMapping("user.form")
    @ResponseBody
    public User test4() {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setStatus("1234");
        return user;
    }

    @GetMapping("listUser.form")
    @ResponseBody
    public List<User> test5() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId(1);
            user.setName("张三");
            user.setStatus("1234");
            list.add(user);
        }
        return list;
    }
}
