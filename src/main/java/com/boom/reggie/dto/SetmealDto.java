package com.boom.reggie.dto;


import com.boom.reggie.entity.Setmeal;
import com.boom.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
