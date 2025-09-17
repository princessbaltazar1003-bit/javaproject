package collection;


import java.util.HashMap;
import java.util.Map;

public class PracticeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str =  "Clean world Green world Happy world";
		String[] words= str.split(" ");
		Map<String, Integer> wordCount = new HashMap<>();
			
				for (String word : words) 
		{
					
					System.out.println(word);
		           if(wordCount.keySet().contains(word)) {
		           int last = wordCount.get(word);
		           int latest = last + 1;
		           wordCount.put(word, latest);
		           
	           }else {
	        	   wordCount.put(word, 1);
	           }
	        }
				System.out.println(wordCount);
		 	
		}

}
