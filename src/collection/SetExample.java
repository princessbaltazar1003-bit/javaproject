package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> Numbers = new HashSet<>();
		
		Numbers.add(45);
		Numbers.add(32);
		Numbers.add(21);
		Numbers.add(40);
		
		System.out.println(Numbers);
		
		Numbers.add(21);
		System.out.println(Numbers);
		
		for (int num: Numbers) {
            System.out.println(num);
        }
	}

}
