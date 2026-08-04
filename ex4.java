import java.util.*;
public class ex4{
	public static void main(String args[])
	{
		ArrayList<String>movie1=new ArrayList<>();
		ArrayList<String>movie2=new ArrayList<>();

		movie1.add("344");
		movie1.add("snehal");
		movie1.add("dhurandar");
		movie1.add("welcome");
		movie1.add("animal");

		movie2.add("murder");
		movie2.add("gajani");
		movie2.add("welcome");
		movie2.add("animal");

		System.out.println(movie1);
		System.out.println(movie2);
		movie1.retainAll(movie2);
		System.out.println(movie1);
		System.out.println(movie2);
	}
}