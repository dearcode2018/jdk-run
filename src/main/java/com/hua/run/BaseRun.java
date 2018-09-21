package com.hua.run;

import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class BaseRun
{
	public static void main(final String[] args)
	{
			List<String> list = new ArrayList<>();
			list.add("hello");
			list.add("world");
			for (String e : list)
			{
				System.out.println(e);
			}
	}
	
	@Test
	public void test()
	{
		
	}
}

