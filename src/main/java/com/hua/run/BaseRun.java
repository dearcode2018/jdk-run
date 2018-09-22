package com.hua.run;

import org.junit.*;
import java.util.List;
import java.util.ArrayList;

import com.hua.entity.User;

public class BaseRun
{
	public static void main(final String[] args)
	{
			List<User> list = new ArrayList<>();
			User e = null;
			
			e = new User();
			e.setId("2012555");
			e.setName("张三");
			list.add(e);
			
			e = new User();
			e.setId("20165325");
			e.setName("李四");
			list.add(e);
	
			for (User u : list)
			{
				System.out.println(u.getId() + ": " + u.getName());
			}
	}
	
	@Test
	public void test()
	{
		
	}
}

