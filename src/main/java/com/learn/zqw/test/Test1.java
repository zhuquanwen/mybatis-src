package com.learn.zqw.test;

import com.learn.zqw.domain.User;
import com.learn.zqw.mapper.IUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2020/3/8 20:17
 * @since jdk1.8
 */
public class Test1 {
  public static void main(String[] args) throws IOException {
    //1.读取配置文件
    InputStream in = Resources.getResourceAsStream ("SqlMapConfig.xml");
    //2. 创建SqlSessionFactory
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(in);
    //3.使用工厂生产SqlSession对象
    SqlSession session = factory.openSession ();
    //4.使用SqlSession创建Mapper接口的代理对象
    IUserMapper userMapper = session.getMapper(IUserMapper.class);
    List<User> all = userMapper.findAll();
    all.forEach(System.out::println);
    session.close();
    in.close();
  }
}
