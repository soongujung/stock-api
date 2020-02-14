package com.stock.data.sample.mybatis;

import com.stock.data.domain.user.User;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleMybatisServiceTest {

	@Autowired
	private SampleMybatisService sampleMybatisService;

	@Test
	public void testGetAllUsers(){
		List<User> users = sampleMybatisService.getAllUsers();
		System.out.println(users);
	}
}
