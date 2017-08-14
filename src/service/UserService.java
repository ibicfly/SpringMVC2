package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LoginLogDao;
import dao.UserDao;
import domain.LoginLog;
import domain.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private LoginLogDao loginLogDao;
	public int getUserNum(String username ,String password)
	{
		return userDao.getMatchCount(username, password);
	}
	public String getPassword(String username)
	{
		return userDao.getPassword(username);
	}
	public void loginSu(User user)
	{
		System.out.println("成功登陆");
	}
}
