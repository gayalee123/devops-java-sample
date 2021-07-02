package io.kubesphere.devops;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DevMapper {

    @Select("select name from ums_admin where id=1")
    String getName();

}
