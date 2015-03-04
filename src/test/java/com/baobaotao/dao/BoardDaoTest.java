package com.baobaotao.dao;

import java.util.List;

import org.dbunit.dataset.excel.XlsDataSet;
import org.junit.Test;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.spring.annotation.SpringBean;

import com.baobaotao.domain.Board;
import com.baobaotao.test.dataset.util.XlsDataSetBeanFactory;

public class BoardDaoTest extends BaseDaoTest {
	
	@SpringBean("boardDao")
	private BoardDao boardDao;
	
	/**
	 * 创建一个新的论坛板块
	 * 
	 * @throws Exception
	 */
	@Test
	@ExpectedDataSet("BaobaoTao.ExpectedBoards.xls")
	public void addBoard() throws Exception {
		List<Board> boards = XlsDataSetBeanFactory.createBeans(BoardDaoTest.class, "BaobaoTao.SaveBoards.xls", "t_board", Board.class);
		
		for (Board board : boards) {
			boardDao.save(board);
		}
	}

}
