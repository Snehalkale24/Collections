import java.util.*;
public class majority{

	public static void main(String args[])
	{
		int arr[]={1,2,3,2,1,2};
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		for(Integer key:map.keySet())
		{
			if(map.get(key)>arr.length/2);
			System.out.println(key);
		}
	}
}