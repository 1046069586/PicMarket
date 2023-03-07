package com.example.back_end.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OrderMapper {

    @Update("update nfts set collectUser = #{username} where name = #{name};")
    void buy(@Param("username") String username, @Param("name") String name);
}
