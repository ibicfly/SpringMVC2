package service;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.util.AssertException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestUserService {
	@Autowired
	private UserService service;
	@Test
	public void getService()
	{
		int temp=service.getUserNum("admin","123456");
		System.out.println(temp);
	}
	@Test
	public void getPassword()
	{
		String password=service.getPassword("admin");
		System.out.println(password);
		assertEquals("123456", password);
	}
}	

