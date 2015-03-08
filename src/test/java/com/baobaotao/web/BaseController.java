package com.baobaotao.web;

import javax.servlet.http.HttpServletRequest;

import com.baobaotao.domain.User;

public class BaseController {
	
	protected static final String ERROR_MSG_KEY = "errorMsg";
	
	// ①获取保存在Session中的用户对象
	protected User getSessionUser(HttpServletRequest request) {
		return request.getSession().getAttribute(Commonc)
	}

}
