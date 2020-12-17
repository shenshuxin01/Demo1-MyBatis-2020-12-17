package zkr.ssx.dao;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import zkr.ssx.entity.User;

public interface UserMapper {
    @Select("select * from user where user_name = #{userName} ")
    @Results(id = "userMap",
             value = {
                @Result(property = "userName",column = "user_name"),
                @Result(property = "passWord",column = "pass_word")
             }
    )
    User selectByName(User user);

}
