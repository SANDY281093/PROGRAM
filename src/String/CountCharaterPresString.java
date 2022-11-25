package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharaterPresString {
	public static void main(String[] args) {
		String s="automation";
		Map<Character,Integer> mp=new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
		char c=	s.charAt(i);
		if (mp.containsKey(c)) {
			Integer count = mp.get(c);
			mp.put(c, count+1);
			
		}else {
			mp.put(c, 1);
		}	
	}
		System.out.println(mp);
		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+" is repeated "+entry.getValue());
				
			}
			
		}
		
		
		 
	}

}
