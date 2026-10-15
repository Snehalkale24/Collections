// import java.util.*;

// public class duplicate {
//     public static void main(String args[]) {

//         int arr[] = {1, 2, 3, 2, 23};

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i = 0; i < arr.length; i++) {

//             if(map.containsKey(arr[i])) {
//                 System.out.println("Duplicate: " + arr[i]);
//             }
//             else {
//                 map.put(arr[i], 1);
//             }
//         }
//     }
// }

import java.util.*;
public class duplicate{
	public static void main(String args[])
	{
		int arr[]={12,23,453,23,23};
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				System.out.println("duplicate:"+arr[i]);
			}
			else{
				map.put(arr[i],1);
			}
		}
	}
}