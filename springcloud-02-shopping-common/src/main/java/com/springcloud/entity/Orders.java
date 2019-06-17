package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDERS���Ӧ��ʵ���࣬���ڷ�װһ�ж�����Ϣ
 * 
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements java.io.Serializable{

	private static final long serialVersionUID = -5839833052328193405L;

	/**
	 * ������ϸ���
	 */
	private Integer orderId;
	
	/**
	 * ��ǰ�������û���Ϣ
	 */
    private Users user;
    
	/**
	 * �ջ������������ʡ��Ĭ��Ϊ�û������е��û�����
	 */
    private String consigneeName;
    
	/**
	 * �ջ��˵绰�����ʡ��Ĭ��Ϊ�û����е���ϵ�绰
	 */
    private String consigneeNumber;

	/**
	 * �ջ���ַ
	 */
    private String consigneeSite;

    /**
	 * �µ�ʱ�䣬Ĭ��Ϊ��ǰʱ��
	 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date orderTime;

    /**
	 * ��������
	 */
    private Double orderAmount;

    /**
	 * ��ѯ����������״̬��0������,1��������2���ջ���3�Ѹ��4���˻�
	 */
    private Integer orderStatus;

    /**
	 * ��ѯ������ʱ������
	 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderDateMin;

	/**
	 * ��ѯ��������ʱ������
	 */
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderDateMax;
    
    /**
               * ��ѯ��������ʼ����
     */
    private String startMonth;
    
    /**
           * ��ѯ��������ֹ����
     */
    private String endMonth;
    
    /**
            * ͳ�ƽ��������
     */
    private String orderMonth;
    
    /**
          * ͳ�ƽ�������۶�
     */
    private Double orderPrice;

}