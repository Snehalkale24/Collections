import java.util.ArrayList;
public class ex3
{
	public static void main(String args[])
	{
		ArrayList<Integer>list=new ArrayList<>();

		list.add(11);
		list.add(22);
		list.add(22);
		list.add(55);
		list.add(new Integer(11));
		list.add(new Integer(11));
		System.out.println(list);

		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));

		for(Integer num:list)
			System.out.println(num);

		System.out.println("is empty"+list.isEmpty());
		System.out.println(list.contains(11));

		System.out.println(list.remove(Integer.valueOf(11)));

		list.clear();
		System.out.println(list);
	}
}