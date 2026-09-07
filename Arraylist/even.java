import java.util.*;
public class even{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();
		list.add(22);
		list.add(44);
		list.add(11);

		int even=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2==0)
			{ 
				System.out.println(list.get(i));
				
			}
		}
		
	}
}