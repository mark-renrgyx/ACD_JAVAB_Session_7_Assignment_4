package week1.day7.assignment4;

public class StringSorter {
	
//	public static StringBuilder sortEverything (String s) {
//		if (s == null)
//			return null;
//		
//		if (s.length() < 2)
//			return new StringBuilder(s);
//		
//		ArrayList<StringBuilder> result = new ArrayList<StringBuilder>();
//		Scanner scan = new Scanner (s);
//		while (scan.hasNext()) {
//			StringBuilder it = new StringBuilder(scan.next());
//			result.add(it);
//		}
//		result.sort(null);
//		for (StringBuilder each : result)
//			sortChars(each);
//		
//		StringBuilder concat = new StringBuilder("");
//		for (StringBuilder each : result) {
//			concat.append(each + ", ");
//		}
//		scan.close();
//		return concat;
//	}

	public static void sortChars(StringBuilder sb) {
		// Lets do selection sort
		for (int i = 0; i < sb.length(); i++) {
			char selected = sb.charAt(i);
			int index = i;
			for (int j = i; j < sb.length(); j++) {
				if (sb.charAt(j) < selected) {
					selected = sb.charAt(j);
					index = j;
				}
			}
			sb.deleteCharAt(index);
			sb.insert(i, selected);
		}
	}
}
