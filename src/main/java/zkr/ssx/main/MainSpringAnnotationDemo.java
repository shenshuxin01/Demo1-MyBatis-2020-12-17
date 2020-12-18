package zkr.ssx.main;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zkr.ssx.dao.SpringAnnotationMapper;
import zkr.ssx.dao.SpringUserMapper;
import zkr.ssx.entity.SpringUser;
import zkr.ssx.service.AddUser;
import zkr.ssx.service.QueryUser;

import java.io.InputStream;

public class MainSpringAnnotationDemo {
    public static void main(String[] args) throws Exception{
        InputStream resourceAsStream =
                Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();

        SpringAnnotationMapper mapper = sqlSession.getMapper(SpringAnnotationMapper.class);
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("spring-bean.xml");

        AddUser addUser1 = classPathXmlApplicationContext.getBean("addUser", AddUser.class);
        addUser1.add(mapper,new SpringUser("ssx05","04"));
        classPathXmlApplicationContext.close();
        sqlSession.commit();


    }
}
