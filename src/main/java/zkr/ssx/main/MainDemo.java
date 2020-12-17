package zkr.ssx.main;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import zkr.ssx.dao.UserMapper;
import zkr.ssx.entity.User;

import java.io.InputStream;

public class MainDemo {
    public static void main(String[] args) throws Exception{
        InputStream resourceAsStream =
                Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.selectByName(new User("zx",""));
        System.out.println(user);
    }
}
