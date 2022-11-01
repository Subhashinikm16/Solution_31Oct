package Oct31Test;

import java.util.LinkedHashSet;
public class Subsequences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;	
	    LinkedHashSet<String> ans=subseq("","XYBYAXBY");
        for(String  str : ans) {
		    if(findPattern(str)) {
				++count;
				System.out.println(str);
			}
		}
			System.out.println("Count "+count);
	 }
	 private static LinkedHashSet<String> subseq(String processed, String unprocessed) {
	       if (unprocessed.isEmpty()) {
	    	   LinkedHashSet<String> list = new LinkedHashSet<>();
	          if(processed.length() >= 3 ) {
	        	  list.add(processed);
	          }
	           return list;
	       }
	       char ch = unprocessed.charAt(0);
	       LinkedHashSet<String> left = subseq(processed + ch, unprocessed.substring(1));
	       LinkedHashSet<String> right = subseq(processed, unprocessed.substring(1));
	       left.addAll(right);
	       return left;
	}
	private static boolean findPattern(String str) {
			int n = str.length();
		    if(n %2 == 0) {
		    	return str.substring(0,n/2).equals(str.substring(n/2,n));
		    }
			return str.substring(0,(n/2)+1).equals(str.substring(n/2,n));
	}
}