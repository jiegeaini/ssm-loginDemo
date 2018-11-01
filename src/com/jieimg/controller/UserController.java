package com.jieimg.controller;
/**
 * @title �ṩ�û���������Ľӿ�
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
	 * @title ��¼��֤�ӿ�
	 * @function ����ǰ�˴������û�����������������֤
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
		view.addObject("data", "��¼ʧ�ܣ����������û����������Ƿ���ȷ");
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
