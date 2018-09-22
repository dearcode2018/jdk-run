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
			// main方法参数
			System.out.println("args[0]: " + args[0] + ", args[1]: " + args[1]);
			// -D 属性值
			// 若属性值含有特殊字符，同样用双引号包围起来，属性名可以含有.，例如 -Denv.abc=xx
			System.out.println(System.getProperty("env.abc"));
			for (User u : list)
			{
				System.out.println(u.getId() + ": " + u.getName());
			}
	}
	
	@Test
	public void test()
	{
		System.out.println("test succcess");
	}
}

