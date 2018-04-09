

import java.util.*;


public class Project extends Surly{

	public static ArrayList <String> tuple2 = new ArrayList<String>();
	public static List <String> sublister1;

public static void project(){
			
			if(list.contains(Rel)){
				
			int getter = list.indexOf(Rel);	
				String nexterRel = list.get(getter + 1);
				int cogett = column.indexOf(Rel);
				int nextGetter = column.indexOf(nexterRel);
				sublister1 = column.subList(cogett, nextGetter);
				int indent = sublister1.indexOf(pField);
				String strange = tuple.toString();
				Scanner psScanner = new Scanner(strange);
				while(psScanner.hasNext()){tuple2.add(psScanner.next().trim()); tuple2.remove(";]"); tuple2.remove(";"); tuple2.remove(";,"); tuple1.remove(",");}							
																									
				String projector = tuple2.get(indent);
				
				
				System.out.println("+------------------+");
				System.out.println("|	"+pField+"	|");	
				System.out.println("+------------------+");
				System.out.println("|	"+projector+"	|");
				System.out.println("+------------------+");
	
			
	}else{


System.out.println("Could not complete project operation. Possible reasons may include:");
System.out.println("- that the specified relation does not exist.");
System.out.println("- that the column to be projected is not contain in the specified relation.");
System.out.println("Please review the above possible causes in your command and try again.");}
}

}