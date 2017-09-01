package cn.hsbc.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hsbc.core.bean.Items;
import com.hsbc.core.service.ItemsService;

/**
 * 商品信息业务类的测试类
 * 
 * @author 刘翔，15809189439
 * @version 1.0，2017-8-22 12:08:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class ItemsServiceTest {

	@Resource
	private ItemsService itemsService;
	
	
}
