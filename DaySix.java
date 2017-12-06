import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class DaySix{
	public static void main(String[] args){
		try {
			BufferedReader br = new BufferedReader(new FileReader("inputDay6.txt"));
			String in = br.readLine();
			String[] tempValues = in.split("\\s+");			
			int[] values = new int[tempValues.length];
			for(int i = 0; i < tempValues.length; i++){
				values[i] = Integer.parseInt(tempValues[i]);
				//
				System.out.print(values[i]+" ");
				//
			}
			ArrayList<int[]> previousValues = new ArrayList();
			int currentIndex;
			int countdown;
			int numCycles = 0;
			int[] temp;
			while(noRepeats(previousValues, values)){
				temp = values.clone();
				previousValues.add(temp);
				currentIndex = getHighestIndex(values);
				countdown = values[currentIndex];
				values[currentIndex] = 0;
				currentIndex++;
				while(countdown != 0){
					values[currentIndex % values.length]++;
					currentIndex++;
					countdown--;
				}
				//
				System.out.println(Arrays.toString(values));
				//
				
				numCycles++;
			}
			System.out.println(numCycles);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static boolean noRepeats(ArrayList<int[]> prev, int[] curr){
		if(prev.isEmpty())
			return true;
		for(int[] temp: prev){
			if(Arrays.equals(temp, curr))
				return false;
		}
		return true;
		
	}	
	public static int getHighestIndex(int[] values){
		int max = 0;
		int index = -1;
		for(int i = 0; i < values.length; i++){
			if(values[i] > max){
				max = values[i];
				index = i;
			}
		}
		return index;
	}
}