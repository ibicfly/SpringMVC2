package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import domain.User;
@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int getMatchCount(String username,String password)
	{
		String sql="select count(*) from t_user where uName=?" +
				"and password=?";
		
		return jdbcTemplate.queryForInt(sql,new Object[]{username,password});
	}
	public String getPassword(String username)
	{
		String sql="select password from t_user where uName=?";
		String password = null;
		try {
			password=jdbcTemplate.queryForObject(sql, new Object[]{username},String.class);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(password!=null)
		{
			return password;
		}else
		{
			return null;
		}
	}
//	public void updateUser(User user)
//	{
//		String sql="insert into t_login_log(uId,ip,loginTime) values(?,?,?)";
//		Object[] args={user.getuId()};
//		jdbcTemplate.update(sql,args);
//	}
}	
