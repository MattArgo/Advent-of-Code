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
			for(int i = 0; i < list.length()-1; i++){
				if(matches(list, i))
					vals.add(Integer.valueOf(list.charAt(i)));
				
			}
			if(Integer.valueOf(list.charAt(list.length() - 1)) 
				== Integer.valueOf(list.charAt(0)))
				vals.add(Integer.valueOf(list.charAt(0)));
			toReturn = addAll(vals);
			
			System.out.println(toReturn);
			
		}
	
	
	
	}
	
	public static int addAll(LinkedList<Integer> nums){
		int toReturn = 0;
			for(int i = 0; i < nums.size(); i++){
				toReturn += (Integer.valueOf(nums.get(i))-48);
			}
		return toReturn / 2;
	}
	
	public static boolean matches(String list, int index){
		if(Integer.valueOf(list.charAt(index)) 
		== Integer.valueOf(list.charAt((index + (list.length()/2))%list.length())))
			return true;
		else
			return false;
	}	

}