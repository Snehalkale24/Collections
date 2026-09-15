import java.util.*;
public class anagram{
	public static void main(String args[])
	{
		String s1="silent";
		String s2="list";

		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else{
				map.put(ch,1);
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			map.put(ch,map.get(ch)-1);
		}
		System.out.println(map);
	}
}