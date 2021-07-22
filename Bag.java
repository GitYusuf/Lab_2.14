import java.util.LinkedList;

public class Bag {
	
	private LinkedList<String> list = new LinkedList<>();
	
	
	public Bag(String characters) {
		list = substring(characters);
	}
	
	public LinkedList<String> getList() {
		return list;
	}
	
	private LinkedList<String> substring(String word) {
		if(!list.contains(word)) {
			list.add(word);
		}
		
		if((word.length() < 3)) {
			 return list;	
		}
		
		for (int i = 0; i < word.length(); i++) {
			String shorter = word.substring(0, i) + word.substring(i + 1);
			substring(shorter);
		} return list;			
	}	
}
