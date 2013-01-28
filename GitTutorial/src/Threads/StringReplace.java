package Threads;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringReplace 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		method1();
		//method2();
		
	}
	public static void method1()
	{
		String str="There is a [server] in my pc , I am [name]";
		Scanner ob=new Scanner(System.in);
		System.out.println(" Enter String");
		String str1=new String();
		str1=ob.nextLine();
		
		Map<String,String> listvalue=new HashMap<String,String>();
		listvalue.put("server", "localhost");
		listvalue.put("name", "Satya");
		
		
		for (Map.Entry<String, String> e : listvalue.entrySet())
		{
			//System.out.println(e.getKey()+"\t"+e.getValue());  
			
			
			str1 = str1.replaceAll("\\[" + e.getKey() + "\\]", e.getValue());
			
		}
		System.out.println(str1);
		
	}	
	public static void method2()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println(" Enter String");
		String str=ob.next();
		
		
		ResourceBundle bundle=ResourceBundle.getBundle("display");
		
		

	
		if(bundle.containsKey("server"))
		{
		//str=str.replaceAll("\\["+bundle.+"\\]",bundle.getString("server"));
		}
		System.out.println(str);
		//System.out.println(s1);
		//System.out.println(s2);
		
	}
		
		
		
		
		

	

}
