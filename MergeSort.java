package Review;

import java.util.*;
public class MergeSort
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Rahul", "Yash", "Kartik", "Rupesh", "kiwi", "mango");
		List<String> sortedList = mergeSort(list);
		System.out.println(sortedList);
	}
	    
	public static List<String> mergeSort(List<String> list)
	{
		if (list.size() <= 1) 
		{
			return list;
		}
	        
		int mid = list.size() / 2;
		List<String> left = list.subList(0, mid);
		List<String> right = list.subList(mid, list.size());
	        
		left = mergeSort(left);
		right = mergeSort(right);
	        
		return merge(left, right);
	}
	    
	public static List<String> merge(List<String> left, List<String> right) {
		List<String> result = new ArrayList<>();
	        int i = 0, j = 0;
	        while (i < left.size() && j < right.size()) {
	            if (left.get(i).compareTo(right.get(j)) < 0) {
	                result.add(left.get(i));
	                i++;
	            } else {
	                result.add(right.get(j));
	                j++;
	            }
	        }
	        while (i < left.size()) {
	            result.add(left.get(i));
	            i++;
	        }
	        while (j < right.size()) {
	            result.add(right.get(j));
	            j++;
	        }
	        return result;
	    }
	}

