package com.jieimg.controller;
/**
 * @title 提供用户方面操作的接口
 * @author jiege
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.jieimg.servicedao.UserServiceDao;
@Controller
public class UserController {
	@Autowired
	UserServiceDao userService;
	/**
	 * @title 登录验证接口
	 * @function 接收前端传来的用户名与密码来进行验证
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView login
	(HttpServletRequest request,HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ModelAndView view = new ModelAndView();
		if (userService.login(username, password)) {
			view.setViewName("index");
			return view;
		}
		view.addObject("data", "登录失败，请检查您的用户名和密码是否正确");
		view.setViewName("login");
		return view;
		
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		return view;
	}

}
