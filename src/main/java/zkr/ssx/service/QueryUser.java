package zkr.ssx.service;

import zkr.ssx.dao.SpringUserMapper;
import zkr.ssx.entity.SpringUser;

import java.util.List;

public class QueryUser {

    public void queryUserAll(SpringUserMapper mapper){
        List<SpringUser> springUsers = mapper.selectAll();
        springUsers.forEach((springUser -> System.out.println(springUser)));
    }
}
