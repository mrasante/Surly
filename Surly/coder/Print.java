import java.io.*;


public class Print extends Surly{

public static void print() throws FileNotFoundException{
 		
		
				
				
	if(list.contains(lrelName)){
	     System.out.println("+ -------------------------------+");
	     System.out.println("|"+"		"+lrelName+"		"+"|");	
	     System.out.println("+ -------------------------------+");
	     System.out.println("| "+col1+" "+col2+" "+col3+" "+col4+" "+col5+" "+col6+" "+col7+" |");
	     System.out.println("+ -------------------------------+");

		}else{System.out.println("The specific relation does exist. Please check and try again.");}
  		if(tuple.contains(lrelName)){
			int numb = tuple.indexOf(lrelName);
			String row = tuple.get(numb + 1);
			System.out.println("|"+ row + "|");
		}
		

				

	 else{System.out.println("The specified relation does not contain any records.");}

			
}

}