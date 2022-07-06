package com.boom.reggie.service;

import com.boom.reggie.dto.SetmealDto;
import com.boom.reggie.entity.Setmeal;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 套餐 服务类
 * </p>
 *
 * @author anyi
 * @since 2022-05-24
 */
public interface SetmealService extends IService<Setmeal> {

    void add(SetmealDto setmealDto);

    Page<SetmealDto> getPage(Integer page, Integer pageSize, String name);

    SetmealDto getSetmeal(Long ids);

    void updateSetmeal(SetmealDto setmealDto);

    void delete(String  ids);
}
