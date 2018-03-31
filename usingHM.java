package odessa;

import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;
//import java.util.Set;

public class usingHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(char c : s.toCharArray()) {
			if(hm.containsKey(c)) {
				//int val = hm.get(c);
				hm.put(c, hm.get(c) + 1);
				//hm.put(c, val+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		//Set<Map.Entry<Character, Integer>> numSet = hm.entrySet();
		//for(Map.Entry<Character, Integer> m : numSet){
			//System.out.println("Char- " + m.getKey() + " Count " + m.getValue());
		//}
		for ( Character key : hm.keySet()){
			if(hm.get(key)>1)
				System.out.println("Character : '"+key+"' Count :"+hm.get(key));
        }
	}
}