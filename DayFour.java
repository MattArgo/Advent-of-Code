import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class DayFour{
	public static void main(String[] args){
		try {
			BufferedReader br = new BufferedReader(new FileReader("inputDay4.txt"));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			
			int toReturn = 0;
			
			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			String input = sb.toString();
			String[] lines = input.split("\\R"); //Lines

			for(String l: lines){
				String[] passphrases = l.split("\\s+");
				if(noRepeat(passphrases))
					toReturn++;
			}
			
			System.out.println(toReturn);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static boolean noRepeat(String[] words){
		LinkedList<String> phraseCheck = new LinkedList();
		for(String p: words){
			if(!phraseCheck.contains(p)){
				phraseCheck.add(p);
			}
			else{
				return false;
			}
		}
		return true;
	}
}