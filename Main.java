import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static <T extends Comparable<T>> T findLargest(ArrayList<T> list)
	{
		T largest = list.get(0);
		for (T number : list)
		{
			if (number.compareTo(largest) > 0)
			{
				largest = number;
			}
		}
		return largest;
	}
	
	public static <T extends Comparable<T>> int indexOfLargest(ArrayList<T> list)
	{
		return list.indexOf(findLargest(list));
	}
	
	public static <T> int indexOfInt(ArrayList<T> list, T target)
	{
		return list.indexOf(target);
	}
	
	public static <T> boolean hasSameElements(ArrayList<T> list1, ArrayList<T> list2)
	{
		return list1.equals(list2);
	}

}
