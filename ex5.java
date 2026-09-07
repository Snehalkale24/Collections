import java.util.Iterator;
import java.util.ArrayList;
public class ex5{
	public static void main(String args[])
	{
		ArrayList<String>movie1=new ArrayList<>();

		movie1.add("20");
		movie1.add("500");
		movie1.add("dhurandar");
		movie1.add("welcome");

		Iterator<String>itr=movie1.iterator();


		while(itr.hasNext())//is check another element available,if yes return true
		{
			System.out.println(itr.next());//next do two thing moves the iterator to the next element.return that element
		}
	}
}