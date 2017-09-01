package com.hsbc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.common.page.Pagination;

import com.hsbc.core.bean.ItemsQuery;
import com.hsbc.core.service.ItemsService;

@Controller
public class ItemsController {
	
	@Resource
	private ItemsService itemsService;
	
	@RequestMapping("/list.shtml")
	public String search(Integer pageNo,Model model){
		StringBuffer params = new StringBuffer();
		ItemsQuery itemsQuery = new ItemsQuery();
		itemsQuery.setPageNo(Pagination.cpn(pageNo));
		itemsQuery.setPageSize(3);
		Pagination pagination = itemsService.selectPaginationByQuery(itemsQuery);
		pagination.pageView("/pagination-front/list.shtml", params.toString());
		String url="/pagination-front/list.shtml";
		model.addAttribute("pagination", pagination);
		return "pagination";
		
	}
	
	
}
