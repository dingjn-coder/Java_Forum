package com.dingjn.manage.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dingjn.manage.persistence.entity.SysApi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 系统Http接口表，配合sys_role_api控制接口访问权限 Mapper 接口
 * </p>
 *
 * @author dingjn
 * @since 2020-06-13
 */
public interface SysApiMapper extends BaseMapper<SysApi> {
    List<SysApi> selectApiTree(@Param("rootApiId") Integer rootApiId,
                               @Param("apiNameLike") String apiNameLike,
                               @Param("apiStatus") Boolean apiStatus);
}
