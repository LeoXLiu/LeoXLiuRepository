package com.hsbc.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import redis.clients.jedis.JedisPool;
import cn.itcast.common.page.Pagination;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hsbc.core.bean.Items;
import com.hsbc.core.bean.ItemsQuery;
import com.hsbc.core.dao.ItemsMapper;
import com.hsbc.core.service.ItemsService;


/**
 * 商品信息业务类接口的实现类
 * 
 * @author 刘翔，15809189439
 * @version 1.0,2017-8-22 12:05:12
 */
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
	
	@Resource
	private ItemsMapper itemsMapper;
	
	@Resource
	private JedisPool jedisPool;

	@Override
	public Pagination selectPaginationByQuery(ItemsQuery itemsQuery) {
		int totalcount = itemsMapper.countByExample(itemsQuery);
		Pagination pagination = new Pagination(itemsQuery.getPageNo(), itemsQuery.getPageSize(), totalcount);
		itemsQuery.setPageNo(pagination.getPageNo());
		PageHelper.startPage(pagination.getPageNo(), pagination.getPageSize());
		List<Items> items = itemsMapper.selectByExample(itemsQuery);
		pagination.setList(items);
		return pagination;
	}

	
	
}
