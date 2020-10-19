package com.ang.oauth.mappers;

import com.ang.oauth.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

public interface ApiMapper extends BaseMapper<Admin> {

    List<Admin> findAll();

    IPage<Admin> selectCustomerPage(Page<?> page, String name);
}
