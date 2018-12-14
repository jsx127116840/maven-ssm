package com.baizhi;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
UserMapper userMapper;

    @org.junit.Test
    public void test() {
        List<User> users =userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
  }

    @org.junit.Test
    public void test2() {
        User user=new User("jht","123456");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @org.junit.Test
    public void test3() {
        Example userExample = new Example(User.class);
        userExample.setForUpdate(true);

        userExample.createCriteria().andEqualTo("password","123456");
                userExample.or().andEqualTo("password","12345");
        List<User> user = userMapper.selectByExample(userExample);
        System.out.println(user);

    }
}
