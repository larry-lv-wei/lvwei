package com.itheima.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MapperTest {
//    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapconfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //模拟条件user
       /*// User condition = new User();
        condition.setId(1);
        condition.setName("zhangsan");
        condition.setDenpId(22222);*/

/*
        List<User> userList = mapper.findByCondition(condition);
        System.out.println(userList);*/
    }
}
