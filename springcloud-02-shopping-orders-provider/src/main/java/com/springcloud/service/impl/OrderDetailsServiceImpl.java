package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.dao.OrderDetailMapper;
import com.springcloud.entity.OrderDetail;
import com.springcloud.service.OrderDetailsService;

/**
 * 订单明细模块模型层的实现类
 * 
 * @author 左丹丹
 */
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Autowired
	private OrderDetailMapper orderDetailMapper;
	
	@Override
	public PageInfo<OrderDetail> selectByOrderId(Integer orderId, Integer pageNumber) {
		//设置分页信息
		PageHelper.startPage(pageNumber + 1 , 5);
		//查新指定订单编号的订单明细信息
		List<OrderDetail> list = this.orderDetailMapper.selectByOrderId(orderId);
		return new PageInfo<>(list);
	}

}
