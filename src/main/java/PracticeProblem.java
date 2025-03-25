import java.util.ArrayList;
import java.util.HashMap;

public class PracticeProblem {
	//1. Create a function called _swap()_. It takes in an ArrayList of Strings and two integers as parameters.  
	//Swap the two elements in the ArrayList at the indexes of the given integers.
	public static ArrayList<String> swap(ArrayList<String> array, int index1, int index2) {
		String temp = array.get(index1);
		array.set(index1, array.get(index2));
		array.set(index2, temp);
		return array;
	}
	//2. Create a fucntion called _createArrayList()_. It takes in an Array of doubles.
	// Returns an ArrayList of the same doubles.
	public static ArrayList<Double> createArrayList(double[] array) {
		ArrayList<Double> newarray = new ArrayList<Double>();
		for (double i : array) {
			newarray.add(i);
		}
		return newarray;
	}
	//3. Create a function called _combineParallelArrays()_.  It takes in two arrays that are parallel as parameters, a String array of names and a integer array of ages.
	//   Combine the two together in a hashmap with the names as keys and ages as definitions.  Return the HashMap.
	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], ages[i]);
		}
		return map;
	}
	//4. Create a function called _increaseAge()_.  It takes in a HashMap(String, Integer) and a String (name) as parameters.  
	//   Increase the age (values) associated with the name by one.
	public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> map, String name) {
		if (map.containsKey(name)) {
            map.put(name, map.get(name) + 1);
        }
        return map;
	}

}
