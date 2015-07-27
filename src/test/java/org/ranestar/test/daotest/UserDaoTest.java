package org.ranestar.test.daotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ranestar.test.dao.UserDao;
import org.ranestar.test.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*-context.xml" , 
"classpath:context/**/applicationContext*.xml"})
public class UserDaoTest {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);

	@Autowired UserDao userDao;
	
	@Test
	public void saveTest() {
		
		User user = new User();
		user.setId("test");
		user.setName("테스트");
		
		userDao.save(user);
		
	}

}
