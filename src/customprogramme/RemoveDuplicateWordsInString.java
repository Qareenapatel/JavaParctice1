package customprogramme;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) {

		String input = "I am am Reena Reena";

		String[] inputArr = input.split(" ");

		Set<String> mySet = new LinkedHashSet<String>();

		for (String x : inputArr) {
			mySet.add(x);
		}

		Iterator itr = mySet.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
