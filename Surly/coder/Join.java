

import java.util.*;



	public class Join extends Surly{
		
		public static String shower1;

       public static void join(){
	                      
                 	
			if(list.contains(rel1) && list.contains(rel2)){
				
			int gette = list.indexOf(rel1);
			String nextRel = list.get(gette + 1);
			int gett = column.indexOf(nextRel);
			int gett1 = column.indexOf(rel1);	
				subber = column.subList(gett1, gett);				
				String join1 = subber.toString();
				int gette1 = list.indexOf(rel2);
				String nexRel = list.get(gette1 + 1);
				int gett2 = column.indexOf(nexRel); 
				int gett3 = column.indexOf(rel2);
				sublister2 = column.subList(gett3, gett2);
				String join2 = sublister2.toString();
				String resulting = join1+join2;
				System.out.println(resulting);
               	    			
	}		
		
	}
}