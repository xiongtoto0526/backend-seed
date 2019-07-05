package com.yl.river.mapper;

import com.yl.river.model.SysUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SysUserMapper {
    @Delete({
        "delete from sys_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into sys_user (user_name, password, ",
        "role)",
        "values (#{userName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{role,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SysUser record);

    int insertSelective(SysUser record);

    @Select({
        "select",
        "id, user_name, password, role",
        "from sys_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.yl.river.mapper.SysUserMapper.BaseResultMap")
    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    @Update({
        "update sys_user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "role = #{role,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysUser record);

    @Select("select * from sys_user")
    List<SysUser> selectAll();

    @Select("select * from sys_user where user_name = #{0} and password = #{1}")
    List<SysUser> isValidUser(String userName, String password);
}