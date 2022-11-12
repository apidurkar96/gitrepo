package collection;

import java.util.ArrayList;

public class Demo1 {
	
	public static void main(String[] args)
	{
ArrayList abc =new ArrayList();
		
		abc.add("selenium");
		abc.add(100);
		abc.add(true);
		abc.add(100);
		abc.add("HTML");
		abc.add("jenkins");
		
		System.out.println(abc);
		
		System.out.println(abc.remove(4));
		//System.out.println(abc.remove("HTML"));
		
		System.out.println(abc);	
		
		//System.out.println(abc.get(5));
		
		//System.out.println(abc.size());
		
//		for(int i=0;i<abc.size();i++)
//		{
//			System.out.println(abc.get(i));
//		}
		
		
		//		for(Object o:abc)
//		{
//			System.out.println(o);
//		}