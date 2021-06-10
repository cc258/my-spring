package com.cc.demo.mapper;

import com.cc.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserMapperTest {

    // 前面的测试报错，后面将不再执行

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

    // 测试数值等
    @Test
    void testAssertEquals(){
        int num = 2 + 3;
        assertEquals(5, num, "数值不等于5");
    }

    // 测试同一个对象
//    @Test
//    void testAssertSame(){
//        Object o1 = new Object();
//        Object o2 = new Object();
//        assertSame(o1,o2,"对象的内存地址不一样");
//    }

    // 测试数组
//    @Test
//    void testArray(){
//        Object o1 = new Object();
//        Object o2 = new Object();
//        assertArrayEquals(new int[]{1,2},new int[]{1,2},"数组内容不相等");
//    }

    // 测试异常
//    @Test
//    void testException(){
//        assertThrows(ArithmeticException.class, ()->{int i = 10/0; }, "居然没异常，有问题");
//    }

    // 测试快速失败
//    @Test
//    void testFail(){
//        if(1==2){
//            fail("主动测试失败");
//        }
//    }

}