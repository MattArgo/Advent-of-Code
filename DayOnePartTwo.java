import java.util.Scanner;
import java.util.LinkedList;
public class DayOnePartTwo{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> vals;
		int toReturn;
		while(in.hasNext()){
			vals = new LinkedList();
			String list = in.next();
			for(int i = 0; i < list.length(); i++){
				if(matches(list, i))
					vals.add(Integer.valueOf(list.charAt(i)));
				
			}
		
			toReturn = addAll(vals);
			
			System.out.println("Final: " + toReturn);
			
		}
	
	
	
	}
	
	public static int addAll(LinkedList<Integer> nums){
		int toReturn = 0;
			for(int i = 0; i < nums.size(); i++){
				toReturn += (Integer.valueOf(nums.get(i))-48);
				System.out.println("Update: " + toReturn);
			}
		return toReturn;
	}
	
	public static boolean matches(String list, int index){
		if(Integer.valueOf(list.charAt(index)) 
		== Integer.valueOf(list.charAt((index + (list.length()/2))%list.length())))
			return true;
		else
			return false;
	}	

}