package com.cc.demo.mapper;

import com.cc.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @BeforeEach
    void testBeforeEach(){
        log.info("@@@ test begin ...");
    }

    // 注意是@BeforeAll | @AfterAll是使用static方法
    @BeforeAll
    static void testBeforeAll(){
        log.info("@@@ test begin all...");
    }

    @AfterAll
    static void testAfterAll(){
        log.info("@@@ test end all...");
    }

    @DisplayName("测试Displayname注解")
    @Test
    void testUserMapper(){
        log.info("----- selectAll method test ------");
        User user = userMapper.selectById(1L);
        log.info("----- user info:  {}", user);
    }

    @Test
    void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}