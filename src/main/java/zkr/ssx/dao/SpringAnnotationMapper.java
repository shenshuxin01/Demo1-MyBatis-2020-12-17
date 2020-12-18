package zkr.ssx.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;
import zkr.ssx.entity.SpringUser;


public interface SpringAnnotationMapper {
    @Insert("insert into spring_tab1 values(#{id},#{name})")
    void addUser(SpringUser user);
}
