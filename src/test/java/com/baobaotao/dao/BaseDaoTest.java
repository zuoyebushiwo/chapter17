package com.baobaotao.dao;

import java.io.File;

import junit.framework.Assert;

import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;

@SpringApplicationContext({ "classpath:baobaotao-dao.xml" })
public class BaseDaoTest extends UnitilsJUnit4 {
	
	@Test
	public void test1() {
		File temp = new File("classpath:baobaotao-dao.xml");
		System.out.println(temp.exists());
		System.out.println(this.getClass().getClassLoader().getResource(""));
		File file = new File("src/main/resources/baobaotao-dao.xml");
		Assert.assertEquals(file.exists(), true);
	}

}
