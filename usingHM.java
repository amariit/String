Write a java program to find the total occurance of character of string?
	
_______________________________*************************************************_____________________________________________

Code : 

import java.util.HashMap;
import java.util.Scanner;

public class CharOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		HashMap<Character,Integer> hm = new HashMap<>();
		//Inserting the character into HashMap
		for(char c : s.toCharArray()) {
			//if character is found then only increase the character value of HashMap
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
				}
			//Inserting the character value into the HashMap
			else {
				hm.put(c, 1);
			}
		}
		for ( Character key : hm.keySet()){
			if(hm.get(key)>1)
				System.out.println("Character : '"+key+"' Count :"+hm.get(key));
        }
	}
}
