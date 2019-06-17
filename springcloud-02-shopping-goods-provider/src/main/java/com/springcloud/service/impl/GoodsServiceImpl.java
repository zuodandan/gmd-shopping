package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.dao.GoodsMapper;
import com.springcloud.entity.Goods;
import com.springcloud.service.GoodsService;

/**
 * ��Ʒģ�Ͳ��ʵ���ࣺ����ʵ����Ʒģ��ķ���
 * 
 * @author �󵤵�
 *
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;

	@Transactional
	@Override
	public Integer insert(Goods goods) {
		return this.goodsMapper.insert(goods);
	}

	@Override
	public PageInfo<Goods> select(Goods goods, Integer pageNumber) {
		// ��Ʒ�������˼���%
		goods.setGoodName("%" + goods.getGoodName() +"%");
		//���÷�ҳ��Ϣ
		PageHelper.startPage(pageNumber +1,PageUtils.PAGE_ROW_COUNT);
		//��ѯ������������Ʒ��Ϣ
		List<Goods> list = this.goodsMapper.select(goods);
		return new PageInfo<>(list);
	}

	@Transactional
	@Override
	public Integer updateGoodsById(Goods goods) {
		return this.goodsMapper.updateGoodsById(goods);
	}

	
	@Override
	public Integer update(Goods goods) {
		return this.goodsMapper.updateByPrimaryKey(goods);
	}

	@Override
	public List<Goods> selectGroup() {
		return this.goodsMapper.selectGroup();
	}

}
