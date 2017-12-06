import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class DayFivePartTwo{
	public static void main(String[] args){
		try {
			BufferedReader br = new BufferedReader(new FileReader("inputDay5.txt"));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			
			ArrayList<Integer> ints = new ArrayList();
			
			while(line != null){
					ints.add(Integer.parseInt(line.substring(0,line.length())));
					System.out.println(Integer.parseInt(line.substring(0,line.length())));
					
					
					line = br.readLine();
			}

			int position = 0;
			int move;
			int numMoves = 0;
			
			while((position >= 0) && (position < ints.size())){
				move = ints.get(position);
				if(move < 3)
					ints.set(position, move + 1);
				else
					ints.set(position, move - 1);
				position += move;
				numMoves++;
			}
			
			System.out.println(numMoves);
		}
		catch(Exception e){
			//System.out.println(e.getMessage());
		}
	}

}