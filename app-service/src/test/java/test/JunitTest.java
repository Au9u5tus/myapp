package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuhao.model.pojo.UserPojo;
import com.yuhao.service.UserService;

public class JunitTest {
	@Test
	public void methodTest() {
			ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
			UserService userService=ac.getBean(UserService.class);
			UserPojo user=new UserPojo();
			user.setId("1");
			user.setUserName("余浩");
			userService.insert(user);
	}
}
