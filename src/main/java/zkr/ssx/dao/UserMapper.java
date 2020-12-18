package zkr.ssx.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import zkr.ssx.entity.User;

@CacheNamespace(blocking = true)
public interface UserMapper {


    @Select("select * from user where user_name = #{userName} ")
    @Results(id = "userMap",
             value = {
                @Result(property = "userName",column = "user_name"),
                @Result(property = "passWord",column = "pass_word")

             }
    )

//    @Results(id = "userMap",
//            value = {
//
//                    //一对多 关联表连接查询
//                    @Result(property = "userName",column = "user_name",
//                            many = @Many(select = "select ... ",fetchType = FetchType.LAZY)),
//
//                    //一对一 关联表连接查询
//                    @Result(property = "passWord",column = "pass_word",
//                            one = @One(select = "select ... ",fetchType = FetchType.EAGER))
//
//            }
//    )
    User selectByName(User user);

}
