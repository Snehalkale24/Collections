import java.util.*;
public class ex7{
	public static void main(String args[])
	{
		ArrayList<Integer>no=new ArrayList<Integer>();
        
		no.ensureCapacity(1000);


		for(int i=0;i<1000;i++)
			no.add(i);
		System.out.println(no.size());


		for(int i=0;i<909;i++)
			no.remove(0);


		System.out.println("  "+no.size());
		no.trimToSize();



	}
}