package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * 订单模块模型层 的接口，用于定义订单模型层的方法
 * 
 * @author 左丹丹
 *
 */
public interface OrdersService {

	/**
	 * 查询满足条件的订单信息（分页功能）
	 * 
	 * @param orders	查询条件
	 * @param pageNumber	查询条件
	 * @return	返回com.github.pagehelper.PageInfo<Orders>类型的实例
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	
	/**
	 * 修改指定编号订单的订单状态
	 * @param Orders	修改的订单信息
	 * @return	成功返回大于0的整数，否则返回大于等于0的整数
	 */
	public abstract Integer updateOrdersStatus(Orders orders);
	
	/**
	 * 查询指定日期范围内的销售额
	 * @param orders	查询条件
	 * @return	成功返回java.util.List类型的实例，否则返回null、
	 */
	public abstract List<Orders> selectGroup(Orders orders);
}
