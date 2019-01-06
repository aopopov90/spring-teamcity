package com.popov.teamcity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamcityApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCost() throws Exception{
		Bottle bottle = new Bottle("sistema", 10);
		bottle.setCost(10);
		Assert.assertEquals(10, bottle.getCost(), 0);
	}

}

