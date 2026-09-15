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
		String str="snehall";
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				System.out.println(map);
			}
			else{
				map.put(ch,1);
			}
		}
	}
}