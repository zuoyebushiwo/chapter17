package com.baobaotao.service;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;

@SpringApplicationContext({ "/resources/baobaotao-service.xml", "/resources/baobaotao-dao.xml" })
public class BaseServiceTest extends UnitilsJUnit4 {

	@SpringBean("hibernateTemplate")
	public HibernateTemplate hibernateTemplate;

}
