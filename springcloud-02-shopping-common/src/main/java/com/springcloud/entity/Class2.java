package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS2���Ӧ��ʵ���࣬���ڱ������һ��һ�������Ϣ
 * 
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class2 {
	/**
	 * �������
	 */
	private Integer class2Id;

	/**
	 * ��������
	 */
	private String class2Name;

	/**
	 * ���һ���
	 */
	private Integer class1Id;

	/**
	 * ��ע
	 */
	private String remark;

}