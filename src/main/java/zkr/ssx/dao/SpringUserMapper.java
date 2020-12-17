package zkr.ssx.dao;

import org.apache.ibatis.annotations.Select;
import zkr.ssx.entity.SpringUser;

import java.util.List;

public interface SpringUserMapper {

    @Select("select * from spring_tab1 ")
    List<SpringUser> selectAll();
}
