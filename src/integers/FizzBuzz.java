package integers;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public List<String> fizzbuzz(int n) {
		
		//create an List of String type
		List<String> list = new ArrayList<String>();
		
		for(int i=1;i<=n;i++) {
			
			//check if divisible by both 3 and 5
			if(i%3==0 && i%5==0) {
				list.add("FizzBuzz");
			}
			//check if divisible by 3
			else if(i%3==0){
				list.add("Fizz");
			}
			//check if divisible by 5
			else {
				list.add(Integer.toString(i));
			}
		}
		return list; //return the list
	}
	public static void main(String[] args) {
		
		FizzBuzz b = new FizzBuzz();
		System.out.println(b.fizzbuzz(15));
	}
}

//TC: O(n) and SC: O(n)
