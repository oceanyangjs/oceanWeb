package com.ocean.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocean.mapper.IndexMapper;
import com.ocean.pojo.IndexPojo;
import com.ocean.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService{
	@Autowired
	IndexMapper indexMapper;

	@Override
	public IndexPojo test(int index) {
		// TODO Auto-generated method stub
		return indexMapper.test(index);
	}
	
}
