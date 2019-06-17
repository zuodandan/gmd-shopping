package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ���ڱ���GOODS����һ����Ʒ����Ϣ
 * 
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable {

	private static final long serialVersionUID = 1353677937812774897L;

	/**
	 * ��ƷID
	 */
	private Integer goodId;

	/**
	 * ��Ʒ����
	 */
	private String goodName;

	/**
	 * ��Ʒ�۸�
	 */
	private Double goodPrices;

	/**
	 * ��Ʒ�ۿۼ�
	 */
	private Double goodDiscount;

	/**
	 * ��Ʒ״̬
	 */
	private Integer goodStatus;

	/**
	 * ��Ʒ����
	 */
	private Integer goodCount;

	/**
	 * �Ƿ���Ʒ
	 */
	private Integer goodIsNew;

	/**
	 * �Ƿ�����
	 */
	private Integer goodIsHot;

	/**
	 * ��Ʒ����
	 */
	private Integer goodLevel;

	/**
	 * ��Ʒ���
	 */
	private String goodBrief;

	/**
	 * ��Ʒ����
	 */
	private String goodDetails;

	/**
	 * ��ƷͼƬ
	 */
	private String goodPhoto;

	/**
	 * ���������
	 */
	private Integer class2Id;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMin;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMax;

	/**
	 * ��ѯ������һ�������
	 */
	private Integer class1Id;
	
	/**
	 *��Ʒ���ۣ� ���ڱ���ͳ�Ʒ���Ľ��
	 */
	private Integer goodSum;

}