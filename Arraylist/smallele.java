import java.util.*;
public class smallele{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(44);
		list.add(2);

		int min=list.get(0);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)<min)
			{
				min=list.get(i);
			}
		}
		System.out.println(min);
	}
}