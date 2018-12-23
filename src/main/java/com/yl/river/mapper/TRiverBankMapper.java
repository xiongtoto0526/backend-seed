package com.yl.river.mapper;

import com.yl.river.model.TRiverBank;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TRiverBankMapper {
    @Delete({
            "delete from PROFJSHZZ.T_RIVER_BANK",
            "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into PROFJSHZZ.T_RIVER_BANK (ID, NAME, ",
            "TYPE, LONLATS)",
            "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
            "#{type,jdbcType=VARCHAR}, #{lonlats,jdbcType=CLOB})"
    })
    int insert(TRiverBank record);

    int insertSelective(TRiverBank record);

    @Select({
            "select",
            "ID, NAME, TYPE, LONLATS",
            "from PROFJSHZZ.T_RIVER_BANK",
            "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.yl.river.mapper.TRiverBankMapper.ResultMapWithBLOBs")
    TRiverBank selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TRiverBank record);

    @Update({
            "update PROFJSHZZ.T_RIVER_BANK",
            "set NAME = #{name,jdbcType=VARCHAR},",
            "TYPE = #{type,jdbcType=VARCHAR},",
            "LONLATS = #{lonlats,jdbcType=CLOB}",
            "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(TRiverBank record);

    @Update({
            "update PROFJSHZZ.T_RIVER_BANK",
            "set NAME = #{name,jdbcType=VARCHAR},",
            "TYPE = #{type,jdbcType=VARCHAR}",
            "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TRiverBank record);

    // *****  以下为自定义的方法  ******
    @Select("select ID, NAME, TYPE, LONLATS from PROFJSHZZ.T_RIVER_BANK")
    List<TRiverBank> selectAll();
}