package com.baobaotao.dao;

import java.io.File;

import junit.framework.Assert;

import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;

@SpringApplicationContext({ "classpath:/resources/baobaotao-dao.xml" })
public class BaseDaoTest extends UnitilsJUnit4 {
	
	@Test
	public void test1() {
		File file = new File("src/main/java/resources/baobaotao-dao.xml");
		Assert.assertEquals(file.exists(), true);
	}

}
