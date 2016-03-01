package com.scd.miaoqian.h2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scd.miaoqian.h2.mybatis.PersonMapper;
import com.scd.miaoqian.h2.service.IIndexService;

/**   
 * @Title: IndexServiceImpl.java 
 * @Package com.scd.miaoqian.h2.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author itmyhome   
 * @date 2016年3月1日 下午11:47:35 
 * @version V1.0   
 */
@Service
public class IndexServiceImpl implements IIndexService{
	@Autowired
	private PersonMapper personMapper;

	public void doIndex() {
		personMapper.insert();
		System.out.println("ok");
	}

}


