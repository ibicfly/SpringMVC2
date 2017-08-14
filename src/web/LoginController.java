package web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.User;

import service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	//在这里于做了一个静态的页面的转发
	@RequestMapping(value="/index.html")
	public String loginPage()
	{
		System.out.println("进入login");
		
		return "login";
	}
	//在springmvc中，只要通过requestMapping进行页面信息的获取，并据此添加对应的model的getset方法
	//	，即可成功得到表单数据，并一样也可以进行request,response的获取和使用
	@RequestMapping(value="/loginCheck.html",method=POST)
	public ModelAndView loginCheck(HttpServletRequest request,
			HttpServletResponse response,
			@Valid@ModelAttribute("uName")LoginCommand uCommand,BindingResult buildingRes
			)
	{
		System.out.println("jinru");
		if(buildingRes.hasErrors())
		{
			return new ModelAndView("login");
		}
		System.out.println("进入logincheck");
		String username=uCommand.getuName();
		System.out.println(username);
		String password=null;
		if(userService.getPassword(username)!=null)
		{
			password=userService.getPassword(username);
		}else
		{
			request.setAttribute("errorInfo", "密码为空");
			return new ModelAndView("login");
		}
		if(password.equals(uCommand.getPassword()))
		{
			request.setAttribute("su", "su");
			return new ModelAndView("home");
		}else
		{
			request.setAttribute("errorInfo", "用户名密码不符");
			return new ModelAndView("login");
		}
	}
}
