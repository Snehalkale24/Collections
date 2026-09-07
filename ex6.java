import java.util.*;
public class ex6{
	public static void main(String args[])
	{
		ArrayList<String>frd=new ArrayList<String>();
		frd.add("sneha");
		frd.add("pooja");
		frd.add("dsff");
		frd.add("sf");

		ListIterator<String>itr=frd.listIterator();
//listiterator present in java.util.list interface
//while iterator present in java.util.collection

		//list goes forward and backword

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		ListIterator<String> itrr=frd.listIterator(frd.size());
		while(itrr.hasPrevious()){
			System.out.println(itrr.previous());
		}

		ListIterator<String> itrr2=frd.listIterator(0);
		while(itrr.hasPrevious()){
			System.out.println(itrr2.previous());
	}
}}






// ctr a ctr shift f for allignement