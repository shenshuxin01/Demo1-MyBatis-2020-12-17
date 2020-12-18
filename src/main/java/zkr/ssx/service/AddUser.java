package zkr.ssx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import zkr.ssx.dao.SpringAnnotationMapper;
import zkr.ssx.dao.SpringUserMapper;
import zkr.ssx.entity.SpringUser;
import zkr.ssx.entity.User;
import zkr.ssx.entity.impl.AA;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.List;

@Component
public class AddUser {

    @Resource(name = "CC")
    private AA user;

    @PostConstruct
    void init(){
        System.out.println("init ");
    }

    @PreDestroy
    void destroy(){
        System.out.println("destroy");
    }

    @Value("13")
    private int i;

    public void add(SpringAnnotationMapper mapper,SpringUser user){
//        mapper.addUser(user);
//        mapper.commitSql();
        this.user.fun1();
        System.out.println(i);
    }
}
