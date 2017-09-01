package com.hsbc.core.utils;

import java.util.ArrayList;
import java.util.List;

public class PageQuery <T>  {
	
	/** 分页对象 */
	private T pageModel;
	
	/** 当前页面 */
	private  Integer pageNo;
	
	/** 每页显示条数 */
	private Integer pageSize = 3;
	
	/** 总记录数 */
	private Long total;
	
	/** 总页数 */
	private Integer page;
	
	/** 分页信息集合  */
	private List<T> lists = new ArrayList<T>();

	

	public T getPageModel() {
		return pageModel;
	}

	public void setPageModel(T pageModel) {
		this.pageModel = pageModel;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public List<T> getLists() {
		return lists;
	}

	public void setLists(List<T> lists) {
		this.lists = lists;
	}


}
