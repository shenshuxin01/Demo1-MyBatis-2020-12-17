package zkr.ssx.main;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.w3c.dom.ls.LSOutput;
import zkr.ssx.dao.SpringUserMapper;
import zkr.ssx.dao.UserMapper;
import zkr.ssx.entity.SpringUser;
import zkr.ssx.entity.User;
import zkr.ssx.service.QueryUser;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainSpringDemo {
    public static void main(String[] args) throws Exception{
        InputStream resourceAsStream =
                Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        SpringUserMapper mapper = sqlSession.getMapper(SpringUserMapper.class);

//        List springUsers = mapper.selectAll();
//        springUsers.forEach((single) -> {
//            System.out.println(single.toString());
//        });

        // ioc
//        QueryUser queryUser = new QueryUser();
//        queryUser.queryUserAll(mapper);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-bean.xml");
//         BeanFactory b =  new Resource();("spring-bean.xml");

        Object qaid = context.getBean("qaid");
        SpringUser userbeanid = context.getBean("userbeanid", SpringUser.class);

        QueryUser queryUser = (QueryUser) qaid;
        queryUser.queryUserAll(mapper);

    }
}
