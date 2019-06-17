package com.springcloud.dao;

import com.springcloud.entity.Goods;
import java.util.List;

public interface GoodsMapper {
	int deleteByPrimaryKey(Integer goodId);

	int insert(Goods record);

	Goods selectByPrimaryKey(Integer goodId);

	List<Goods> selectAll();

	int updateByPrimaryKey(Goods record);

	/**
	 * ��ѯgoods����������������Ʒ��Ϣ
	 * 
	 * @param goods ��ѯ����
	 * @return �ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<Goods> select(Goods goods);

	/**
	 * ���������޸�GOODS����ָ��GOODS_ID����Ʒ��Ϣ
	 * 
	 * @param goods �޸ĵ���Ʒ��Ϣ
	 * @return �ɹ����ش���0�����������򷵻�С�ڵ���0������
	 */
	public abstract Integer updateGoodsById(Goods goods);
	
	/**
	 * ��ѯ����ǰ10����Ʒ��Ϣ
	 * @return	�ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<Goods> selectGroup();
}