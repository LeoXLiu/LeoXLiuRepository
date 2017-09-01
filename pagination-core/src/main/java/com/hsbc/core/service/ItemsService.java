package com.hsbc.core.service;

import java.util.List;

import cn.itcast.common.page.Pagination;

import com.hsbc.core.bean.Items;
import com.hsbc.core.bean.ItemsQuery;

/**
 * 商品信息的业务类接口
 * 
 * @author 刘翔，15809189439
 * @version 1.0.2017-8-22 12:03:02
 */
public interface ItemsService {
	
	/**
	 * 查询所有商品信息
	 * 
	 * @return 商品集合
	 */
	public abstract Pagination selectPaginationByQuery(ItemsQuery itemsQuery);
	
	
}
