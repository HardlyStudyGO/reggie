package com.boom.reggie.dto;


import com.boom.reggie.entity.OrderDetail;
import com.boom.reggie.entity.Orders;
import lombok.Data;
import java.util.List;

@Data
public class OrdersDto extends Orders {

    private List<OrderDetail> orderDetails;
	
}
