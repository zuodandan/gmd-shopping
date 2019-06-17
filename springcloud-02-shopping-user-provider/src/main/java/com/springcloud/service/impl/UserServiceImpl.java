package com.springcloud.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.springcloud.common.PageUtils;
import com.springcloud.entity.Users;
import com.springcloud.repository.UsersRepository;
import com.springcloud.service.UsersService;

/**
 * 模型层的实现类：实现用户模块的方法
 * 
 * @author 费琪琪
 *
 */
@Service
public class UserServiceImpl implements UsersService {

	@Autowired
	private UsersRepository usersRepository;

	@Override
	public Users login(Integer userId, String userPassword, Integer jdictionId) {
		return this.usersRepository.login(userId, userPassword, jdictionId);
	}

	@Transactional
	@Override
	public Users insert(Users users) {
		return this.usersRepository.save(users);
	}

	@Override
	public Page<Users> select(Users users, Integer pageNumber) {
		// 根据查询数据，创建动态条件
		@SuppressWarnings("serial")
		Specification<Users> specificatio = new Specification<Users>() {

			@Override
			public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				// 创建List集合，与保存所有的where条件
				List<Predicate> whereList = new ArrayList<>();

				// 根据Users中的查询条件，动态创建查询条件
				if (users.getUserName() != null && !users.getUserName().trim().equals("")) {
					whereList.add(criteriaBuilder.like(root.get("userName"), "%" + users.getUserName() + "%"));
				}
				if (users.getUserStatus() != -1) {
					whereList.add(criteriaBuilder.equal(root.get("userStatus"), users.getUserStatus()));

				}
				// 将所有的条件以and关系连接在一起，并返回
				return criteriaBuilder.and(whereList.toArray(new Predicate[whereList.size()]));
			}

		};
		// 创建JPA的分页信息
		PageRequest of = PageRequest.of(pageNumber, PageUtils.PAGE_ROW_COUNT);

		return this.usersRepository.findAll(specificatio, of);
	}

	@Transactional
	@Override
	public Integer updateStatus(Integer userId, Integer userStatus) {
		return this.usersRepository.updateStatus(userId, userStatus);
	}

	@Override
	public Users selectById(Integer userId) {
		return this.usersRepository.findById(userId).get();

	}

	@Transactional
	@Override
	public Integer update(Users users) {

		return this.usersRepository.update(users);
	}
	@Transactional
	@Override
	public Integer updateMessage(Users users) {
		
		if(users.getUserPhoto()!=null && !users.getUserPhoto().equals("")) {	
			return this.usersRepository.updateImage(users);
		}else if(users.getUserPassword() !=null && !users.getUserPassword().equals("")){
			return this.usersRepository.updatePassword(users);
		}else if(users.getUserName()!=null && !users.getUserName().equals("")) {
			return this.usersRepository.updateName(users);
		}
		return 0;
	}

}
