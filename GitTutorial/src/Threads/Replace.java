package Threads;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {

	/**
	 * @param args
	 */
	public static String replaceTokens(String text,Map<String, String> replacements)
	{
		Pattern pattern = Pattern.compile("\\[(.+?)\\]");
		Pattern pattern1 = Pattern.compile("\\{(.+?)\\}");
		Pattern patt = Pattern.compile("\\{(.+?)\\}");
		Matcher matcher = pattern1.matcher(text);
		
		StringBuffer buffer = new StringBuffer();
		while (matcher.find()) {
			String replacement = replacements.get(matcher.group(1));
			System.out.println(matcher.group(1));
			System.out.println(replacement);
			if (replacement != null) {
//				matcher.appendReplacement(buffer, replacement);
				// see comment 
				matcher.appendReplacement(buffer, "");
				buffer.append(replacement);
				
			}
			
		}
		matcher.appendTail(buffer);
		System.out.println(buffer);
		return buffer.toString();
	}
	public static void replace(String s,ResourceBundle bundle)
	{
		
		
	}
	public static void main(String args[])
	{
		System.out.println(" Enter string ");
		Scanner ob=new Scanner(System.in);
		
		String str1=ob.nextLine();
		String str=" There is a {server} in my pc ,iam {name}";
		Map<String,String> list=new HashMap<String,String>();
		list.put("server", "localhost");
		list.put("name", "");
		
		replaceTokens(str1,list);
		
	}

}
