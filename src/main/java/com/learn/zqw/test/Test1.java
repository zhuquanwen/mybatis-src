package com.learn.zqw.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

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
//    IUserMapper userMapper = session.getMapper(IUserMapper.class);
    session.close();
    in.close();
  }
}
