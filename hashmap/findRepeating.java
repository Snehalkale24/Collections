// import java.util.*;
// public class findRepeating{
// 	public static void main(String args[])
// 	{
// 		String str="snehal";
// 		HashMap<Character,Integer>map=new HashMap<>();
// 		for(int i=0;i<str.length();i++)
// 		{
// 			char ch=str.charAt(i);
// 			if(map.containsKey(ch))
// 			{
// 				System.out.println(ch);
// 				break;
// 			}
// 			else{
// 				map.put(ch,1);
// 			}
// 		}
// 	}
// 

import java.util.*;
public class findRepeating{
	public static void main(String args[])
	{
		String s="snehall";
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				System.out.println(ch);
				break;
			}
			else{
				map.put(ch,1);
			}
		}
	}
}