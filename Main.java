import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<Double> listb = new ArrayList<Double>();
		lista.add("foo");
		lista.add("foo");
		lista.add("bar");
		//lista.add("foo");
		lista.add("foobar");
		lista.add("foobar2000");
		//System.out.println(lista);
		Main.<String>swapPairs(lista);
		//System.out.println(lista);
		
		listb.add(139D);
		listb.add(14D);
		listb.add(92D);
		listb.add(1000D);
		System.out.println(listb);
		swapPairs(listb);
		System.out.println(listb);

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
	
	public static void removeEvenLength(ArrayList<String> list)
	{
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).length()%2 == 0)
			{
				list.remove(i);
			}
		}
	}
	
	public static <T> void removeDuplicates(ArrayList<T> list)
	{
		for (int i = 1; i < list.size(); i++)
		{
			if (list.get(i - 1).equals(list.get(i)))
			{
				list.remove(i);
				i--;
			}
		}
	}
	
	public static <T> void swapPairs(ArrayList<T> list)
	{
		for (int i = 0; i + 1 < list.size(); i += 2)
		{
			T t = list.get(i);
			list.set(i, list.get(i + 1));
			list.set(i + 1, t);
		}
	}
	
	public static <T> void doubleList(ArrayList<T> list)
	{
		for (int i = 0; i < list.size(); i += 2)
		{
			list.add(i, list.get(i));
		}
	}
	
	public static void removeShorterStrings(ArrayList<String> list)
	{
		for (int i = 0; i + 1 < list.size(); i++)
		{
			if (list.get(i).length() <= list.get(i + 1).length())
			{
				list.remove(i);
			} else
			{
				list.remove(i + 1);
			}
		}
	}
	
	public static String censor(String s, char c)
	{
		return s.replace(c, '*');
	}

}
