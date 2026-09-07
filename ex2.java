import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
public class ex2{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(null);

		System.out.println(list);

		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));

			System.out.println(list.size());


			for(Integer i1:list)
				System.out.println(i1);


			list.remove(Integer.valueOf(55));
			System.out.println(list);
		}
	}
}