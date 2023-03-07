package com.example.back_end.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CreateMapper {

    @Insert("insert into nfts (name, externalLink, description, url, type, size, createUser) values (#{name}, #{externalLink}, " +
            "#{description}, #{url}, #{type}, #{size}, #{createUser})")
    int createNFT(@Param("name")String name, @Param("externalLink")String externalLink, @Param("description")String description
                 ,@Param("url")String url, @Param("type")String type, @Param("size")long size, @Param("createUser")String createUser);

}
