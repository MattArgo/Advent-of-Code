import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class DayTwoPartTwo{
	public static void main(String[] args){
		Scanner in;
		try {
			BufferedReader br = new BufferedReader(new FileReader("inputDay2.txt"));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			String input = sb.toString();
			System.out.print(input);
			String currentLine;
			int numOne = 0;
			int numTwo = 0;
			
			int checksum = 0;
			String[] lines = input.split("\\R"); //Lines
			String[] ints;
			int currentInt;
			for (int i = 0; i < lines.length; i++){
				currentLine = lines[i];
				System.out.println(currentLine);
				ints = currentLine.split("\\s+"); //Individual Numbers
			
				for(int k = 0; k < ints.length-1; k++){
					currentInt = Integer.parseInt(ints[k]);
					for(int j = k+1; j < ints.length; j++){
						if((currentInt % Integer.parseInt(ints[j]) == 0)
							|| ((Integer.parseInt(ints[j]) % currentInt) == 0)){
							numOne = Math.max((Integer.parseInt(ints[j])), currentInt);
							numTwo = Math.min((Integer.parseInt(ints[j])), currentInt);
						}
					
					}
				}
				System.out.println("Line " + i + "\nNum One : " + numOne+ "NumTwo: " +numTwo);
				checksum += (numOne / numTwo);
				
			
			}
			System.out.println("Total: " + checksum);		
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
		
		/*
		int checksum = 0;
		int lower = 10;
		int upper = -1;
		char nextChar;
		String nextLine;
		int nextInt;
		
		while(in.hasNextLine()){
			nextLine = in.nextLine();
			
			for(int i = 0; i < nextLine.length(); i++){
				nextChar = nextLine.charAt(i);
				if ((nextChar > 48) && (nextChar < 58)){
					nextInt = nextChar - 48;
					if(nextInt > upper)
						upper = nextInt;
					if(nextInt < lower)
						lower = nextInt;
					System.out.println("Upper: " + upper);
					System.out.println("Lower: " + lower);
				}
			}
			
			checksum += (upper-lower);
			upper = -1;
			lower = 10;
			System.out.println(checksum);
			*/
