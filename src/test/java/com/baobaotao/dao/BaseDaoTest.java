package com.baobaotao.dao;

import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;

@SpringApplicationContext({ "classpath:/baobaotao-dao.xml" })
public class BaseDaoTest extends UnitilsJUnit4 {
	
	@Test
	public void test1() {
		System.out.println(1);
	}

}
