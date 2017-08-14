package dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import domain.LoginLog;

@Repository
public class LoginLogDao {
	private JdbcTemplate jdbcTemplate;
	public void insertLoginLog(LoginLog log)
	{
		String sql="insert into t_login_log(uId,ip,loginTime) values(?,?,?)";
		Object[] args={log.getuId(),log.getIp(),log.getLoginTime()};
		jdbcTemplate.update(sql,args);
	}
}
