package zkr.ssx.main;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.w3c.dom.ls.LSOutput;
import zkr.ssx.dao.SpringUserMapper;
import zkr.ssx.dao.UserMapper;
import zkr.ssx.entity.SpringUser;
import zkr.ssx.entity.User;

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

        List springUsers = mapper.selectAll();
        springUsers.forEach((single) -> {
            System.out.println(single.toString());
        });



    }
}
