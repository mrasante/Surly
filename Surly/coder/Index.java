import java.util.*;



public class Index extends Surly{



public static void index(){
					
					
					shower = column.indexOf(table); 
					counter = column.indexOf(field2);
					int counter1 = counter + 1 ;
					shower1 = column.get(counter);
					sublister = column.subList(shower, counter1);
					
					if(list.contains(table)){
					
							int inte = sublister.indexOf(field1);							
							int inter = sublister.indexOf(field2);
							String strang = tuple.toString();
							Scanner sScanner = new Scanner(strang);
							while(sc.hasNext()){tuple1.add(sc.next().trim()); tuple1.remove(";]"); tuple1.remove(";"); tuple1.remove(";,"); tuple1.remove(",");}							
							
							 
																												
							String index1 = tuple1.get(inte);
							String index2 = tuple1.get(inter);
							String combine = (index1+" "+index2);
							index.put(table, combine);
						
						
						
					System.out.println(index);
					
	
}else {System.out.println("The Relation name given above is wrong or does not exist. Please verify the name or check that the name is in uppercase letters. Thanks!!");	}
					
					
			}
					
}				


